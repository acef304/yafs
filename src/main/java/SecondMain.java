import java.lang.foreign.*;

import org.fuse.*; // A

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.Instant;
import java.util.Arrays;

public class SecondMain {

    static MemorySession mSession = null;

    public static void main(String... args) {
        System.load("/usr/local/lib/libfuse.dylib");  // TODO

        args = new String[]{"-f", "-d", "/users/aleksey/mnt"};  // TODO

        MyMain.files.add("file54");                             // FIXME
        MyMain.filesContent.put("file54", new File("content of file54".getBytes(), (short)0777)); // FIXME
        MyMain.directories.put("/", new File(new byte[0],(short)0777));

        try (MemorySession session = MemorySession.openShared()) {
            mSession = session;
            var arguments = Arrays.stream(args)
                    .map(session::allocateUtf8String)
                    .toArray(MemorySegment[]::new);
            var argumentCount = args.length;
            var argumentSpace = session.allocateArray(ValueLayout.ADDRESS, argumentCount);
            for (int i=0; i<argumentCount; i++) {
                argumentSpace.setAtIndex(ValueLayout.ADDRESS, i, arguments[i]);
            }

            MemorySegment operationsMemorySegment = fuse_operations.allocate(session);

            fuse_operations.getattr$set(operationsMemorySegment, fuse_operations.getattr.allocate(SecondMain::getAttr, session).address());
            fuse_operations.readdir$set(operationsMemorySegment, fuse_operations.readdir.allocate(SecondMain::readDir, session).address());
            fuse_operations.read$set(operationsMemorySegment, fuse_operations.read.allocate(SecondMain::read, session).address());
            fuse_operations.mkdir$set(operationsMemorySegment, fuse_operations.mkdir.allocate(SecondMain::doMkdir, session).address());
            fuse_operations.mknod$set(operationsMemorySegment, fuse_operations.mknod.allocate(SecondMain::doMknod, session).address());
            fuse_operations.write$set(operationsMemorySegment, fuse_operations.write.allocate(SecondMain::doWrite, session).address());
            fuse_operations.unlink$set(operationsMemorySegment, fuse_operations.unlink.allocate(SecondMain::doUnlink, session).address());
            fuse_operations.rmdir$set(operationsMemorySegment, fuse_operations.rmdir.allocate(SecondMain::doRmdir, session).address());
            fuse_operations.chmod$set(operationsMemorySegment, fuse_operations.chmod.allocate(SecondMain::doChmod, session).address());

            fuse_h.fuse_main_real(argumentCount, argumentSpace, operationsMemorySegment, operationsMemorySegment.byteSize(), MemoryAddress.NULL);
        }
    }

    public static int getAttr(MemoryAddress path, MemoryAddress mStat) {
        String jPath = path.getUtf8String(0);
        MemorySegment statMemorySegment = stat.ofAddress(mStat, mSession);

        int S_IFDIR = 0040000; /* directory */
        int S_IFREG = 0100000; /* regular */

        File file;
        int mask;

        if ("/".equals(jPath) || MyMain.isDir(jPath)) {
            file = MyMain.directories.get(jPath);
            mask = S_IFDIR;
            stat.st_nlink$set(statMemorySegment, (short) 2);
        } else if (MyMain.isFile(jPath)) {
            file = MyMain.filesContent.get(jPath);
            mask = S_IFREG;
            stat.st_nlink$set(statMemorySegment, (short) 1);
            stat.st_size$set(statMemorySegment, MyMain.filesContent.get(jPath).content.length);
        } else {
            return -2;
        }

        // setting the stat atim (last access time)
        timespec.tv_sec$set(stat.st_atimespec$slice(statMemorySegment), file.atimesec);
        timespec.tv_nsec$set(stat.st_atimespec$slice(statMemorySegment), file.atimensec);

        // setting the stat mtim (last modify time)
        timespec.tv_sec$set(stat.st_mtimespec$slice(statMemorySegment), file.mtimesec);
        timespec.tv_nsec$set(stat.st_mtimespec$slice(statMemorySegment), file.mtimensec);

        // setting the stat ctim (last c time)
        timespec.tv_sec$set(stat.st_ctimespec$slice(statMemorySegment), file.ctimesec);
        timespec.tv_nsec$set(stat.st_ctimespec$slice(statMemorySegment), file.ctimensec);


        stat.st_uid$set(statMemorySegment, file.uid);
        stat.st_gid$set(statMemorySegment, file.gid);
        stat.st_mode$set(statMemorySegment, (short) (mask | 0777)); // TODO

//        if ("/".equals(jPath) || MyMain.isDir(jPath.substring(1))) {
//            stat.st_mode$set(statMemorySegment, (short) (S_IFDIR | 0777)); // TODO
//            stat.st_nlink$set(statMemorySegment, (short) 2);
//        } else if (MyMain.isFile(jPath.substring(1))) {
//            stat.st_mode$set(statMemorySegment, (short) (S_IFREG | 0777)); // TODO
//            stat.st_nlink$set(statMemorySegment, (short) 1);
//            stat.st_size$set(statMemorySegment, MyMain.filesContent.get(jPath.substring(1)).content.length);
//        } else {
//            return -2;
//        }

        return 0;
    }

    public static int readDir(MemoryAddress path, MemoryAddress buffer, MemoryAddress filler, long offset, MemoryAddress fileInfo) {

        String jPath = path.getUtf8String(0);
        fuse_fill_dir_t fuse_fill_dir_t = org.fuse.fuse_fill_dir_t.ofAddress(filler, mSession);
        fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(".").address(), MemoryAddress.NULL, 0);
        fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String("..").address(), MemoryAddress.NULL, 0);
        if ("/".equals(jPath)) {  // C
            for (String p : MyMain.directories.keySet()) {
                fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(p).address(), MemoryAddress.NULL, 0);
            }

            for (String p : MyMain.files) {
                fuse_fill_dir_t.apply(buffer, mSession.allocateUtf8String(p).address(), MemoryAddress.NULL, 0);
            }
        }

        return 0;
    }

    public static int read(MemoryAddress path, MemoryAddress buffer, long size, long offset, MemoryAddress fileInfo) {
        String jPath = path.getUtf8String(0);

        if (!MyMain.isFile(jPath)) {
            return -1;
        }

        byte[] selected = MyMain.filesContent.get(jPath).content;

        ByteBuffer byteBuffer = MemorySegment.ofAddress(buffer, size, mSession).asByteBuffer();

        byte[] src = Arrays.copyOfRange(selected, Math.toIntExact(offset), Math.toIntExact(size));
        byteBuffer.put(src);

        return src.length;
    }

    static int doMkdir(MemoryAddress path, int mode) {
        String jPath = path.getUtf8String(0);
        MyMain.directories.put(jPath, new File(new byte[0], (short)0777));
        return 0;
    }

    static int doMknod(MemoryAddress path, int mode, long rdev) {
        String jPath = path.getUtf8String(0);
        MyMain.addFile(jPath);
        return 0;
    }

    static int doWrite(MemoryAddress path, MemoryAddress buffer, long size, long offset, MemoryAddress info) {
        byte[] array = MemorySegment.ofAddress(buffer, size, mSession).toArray(ValueLayout.JAVA_BYTE.withOrder(ByteOrder.nativeOrder()));

        String jPath = path.getUtf8String(0);
        if (MyMain.filesContent.containsKey(jPath)) {
            byte[] existing = MyMain.filesContent.get(jPath).content;
            if (existing.length > offset + size) {
                System.arraycopy(array, 0, existing, (int)offset, (int)size);
                MyMain.filesContent.put(jPath, new File(existing, (short)0777));
            } else {
                byte[] newArray = new byte[(int)offset + (int)size];
                System.arraycopy(existing, 0, newArray, 0, (int)offset);
                System.arraycopy(array, 0, newArray, (int)offset, (int)size);
                MyMain.filesContent.put(jPath, new File(newArray, (short)0777));
            }
        }
        return Math.toIntExact(size);
    }

    static int doUnlink(MemoryAddress path) {
        String jPath = path.getUtf8String(0);
        MyMain.files.remove(jPath);
        MyMain.filesContent.remove(jPath);
        return 0;
    }

    static int doRmdir(MemoryAddress path) {
        String jPath = path.getUtf8String(0);
        MyMain.directories.remove(jPath);
        return 0;
    }

    static int doChmod(MemoryAddress path, short attrs) {
        String jPath = path.getUtf8String(0);
        if (MyMain.filesContent.containsKey(jPath)) {
            MyMain.filesContent.get(jPath).attributes = attrs;
        }
        return 0;
    }
}

