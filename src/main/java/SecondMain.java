import java.lang.foreign.*;

import org.fuse.*; // A

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.Instant;
import java.util.Arrays;

public class SecondMain {

    static MemorySession mSession = null;

    public static void main(String... args) {

//        System.load("/usr/lib64/libfuse3.so.3.10.5");  // B
        System.load("/usr/local/lib/libfuse.dylib");  // B

        args = new String[]{"-f", "-d", "/users/aleksey/mnt"};  // C

        MyMain.files.add("file54");
        MyMain.filesContent.put("file54", "content of file54");

//        MemorySegment segment = null;
        try (MemorySession session = MemorySession.openShared()) {
            mSession = session;
            var arguments = Arrays.stream(args)
                    .map(session::allocateUtf8String)
                    .toArray(MemorySegment[]::new); // E
//            var allocator = SegmentAllocator.ofScope(scope);  // F
            var argumentCount = args.length;
//            var argumentSpace = SegmentAllocator.newNativeArena(session).allocate(ValueLayout.ADDRESS,);
            var argumentSpace = session.allocateArray(ValueLayout.ADDRESS, argumentCount);
            for (int i=0; i<argumentCount; i++) {
                argumentSpace.setAtIndex(ValueLayout.ADDRESS, i, arguments[i]);
            }
//            var mmem =
//            var ggg = MemoryLayout.sequenceLayout(1, MemoryLayout.)

            MemorySegment operationsMemorySegment = fuse_operations.allocate(session);

            fuse_operations.getattr$set(operationsMemorySegment, fuse_operations.getattr.allocate((path, stat) -> getAttr(path, stat), session).address()); // A
            fuse_operations.readdir$set(operationsMemorySegment, fuse_operations.readdir.allocate((path, buffer, filler, offset, fileInfo) -> readDir(path, buffer, filler, offset, fileInfo), session).address());
            fuse_operations.read$set(operationsMemorySegment, fuse_operations.read.allocate((path, buffer, size, offset, fileInfo) -> read(path, buffer, size, offset, fileInfo), session).address());
            fuse_operations.mkdir$set(operationsMemorySegment, fuse_operations.mkdir.allocate((MemoryAddress x0, short x1) -> doMkdir(x0, x1), session).address());
            fuse_operations.mknod$set(operationsMemorySegment, fuse_operations.mknod.allocate((MemoryAddress x0, short x1, int x2) -> doMknod(x0, x1, x2), session).address());
            fuse_operations.write$set(operationsMemorySegment, fuse_operations.write.allocate((MemoryAddress x0, MemoryAddress x1, long x2, long x3, MemoryAddress x4) -> doWrite(x0, x1, x2, x3, x4), session).address());

            fuse_h.fuse_main_real(argumentCount, argumentSpace, operationsMemorySegment, operationsMemorySegment.byteSize(), MemoryAddress.NULL); // B

        }
    }

    public static int getAttr(MemoryAddress path, MemoryAddress mStat) {
        String jPath = path.getUtf8String(0);
        MemorySegment statMemorySegment = stat.ofAddress(mStat, mSession);

        int S_IFDIR = 0040000; /* directory */
        int S_IFREG = 0100000; /* regular */

        // setting the stat atim (last access time)
        Instant now = Instant.now();
        timespec.tv_sec$set(stat.st_atimespec$slice(statMemorySegment), now.getEpochSecond()); // C
        timespec.tv_nsec$set(stat.st_atimespec$slice(statMemorySegment), now.getNano());

        // setting the stat mtim (last modify time)
        now = Instant.now();
        timespec.tv_sec$set(stat.st_mtimespec$slice(statMemorySegment), now.getEpochSecond());
        timespec.tv_nsec$set(stat.st_mtimespec$slice(statMemorySegment), now.getNano());

        stat.st_uid$set(statMemorySegment, 501); // D
        stat.st_gid$set(statMemorySegment, 20);

        if ("/".equals(jPath) || MyMain.isDir(jPath.substring(1))) {
            stat.st_mode$set(statMemorySegment, (short) (S_IFDIR | 0777)); // E
            stat.st_nlink$set(statMemorySegment, (short) 2);                       // F
        } else if (MyMain.isFile(jPath.substring(1))) {
            stat.st_mode$set(statMemorySegment, (short) (S_IFREG | 0777));
            stat.st_nlink$set(statMemorySegment, (short) 1);
            stat.st_size$set(statMemorySegment, MyMain.filesContent.get(jPath.substring(1)).getBytes().length); // G
        } else {
            return -2;          // H
        }

        return 0; // I
    }

    public static int readDir(MemoryAddress path, MemoryAddress buffer, MemoryAddress filler, long offset, MemoryAddress fileInfo) {

        String jPath = path.getUtf8String(0);
        fuse_fill_dir_t fuse_fill_dir_t = org.fuse.fuse_fill_dir_t.ofAddress(filler, mSession);  // A
        fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(".").address(), MemoryAddress.NULL, 0); // B
        fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String("..").address(), MemoryAddress.NULL, 0);
        if ("/".equals(jPath)) {  // C
            for (String p : MyMain.directories) {
                fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(p).address(), MemoryAddress.NULL, 0);
            }

            for (String p : MyMain.files) {
                fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(p).address(), MemoryAddress.NULL, 0);
            }
        }

        return 0;
    }

    public static int read(MemoryAddress path, MemoryAddress buffer, long size, long offset, MemoryAddress fileInfo) {
        String jPath = path.getUtf8String(0).substring(1);

        if (!MyMain.isFile(jPath)) {
            return -1;
        }

        byte[] selected = MyMain.filesContent.get(jPath).getBytes();

        ByteBuffer byteBuffer = MemorySegment.ofAddress(buffer, size, mSession).asByteBuffer(); // A

        byte[] src = Arrays.copyOfRange(selected, Math.toIntExact(offset), Math.toIntExact(size)); // B
        byteBuffer.put(src); // C

        return src.length; // D
    }

    static int doMkdir(MemoryAddress path, int mode) {
        String jPath = path.getUtf8String(0);
        MyMain.directories.add(jPath.substring(1));
        return 0;
    }

    static int doMknod(MemoryAddress path, int mode, long rdev) {
        String jPath = path.getUtf8String(0);
        MyMain.addFile(jPath.substring(1));
        return 0;
    }

    static int doWrite(MemoryAddress path, MemoryAddress buffer, long size, long offset, MemoryAddress info) {
        byte[] array = MemorySegment.ofAddress(buffer, size, mSession).toArray(ValueLayout.JAVA_BYTE.withOrder(ByteOrder.nativeOrder()));

        String jPath =path.getUtf8String(0).substring(1);
        MyMain.filesContent.put(jPath, new String(array, java.nio.charset.StandardCharsets.UTF_8));
        return Math.toIntExact(size);
    }
}

