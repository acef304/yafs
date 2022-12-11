// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ostat {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("st_dev"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_LONG_LONG$LAYOUT.withName("st_ino"),
        Constants$root.C_SHORT$LAYOUT.withName("st_mode"),
        Constants$root.C_SHORT$LAYOUT.withName("st_nlink"),
        Constants$root.C_SHORT$LAYOUT.withName("st_uid"),
        Constants$root.C_SHORT$LAYOUT.withName("st_gid"),
        Constants$root.C_SHORT$LAYOUT.withName("st_rdev"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_INT$LAYOUT.withName("st_size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
        ).withName("st_atimespec"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
        ).withName("st_mtimespec"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
        ).withName("st_ctimespec"),
        Constants$root.C_INT$LAYOUT.withName("st_blksize"),
        Constants$root.C_INT$LAYOUT.withName("st_blocks"),
        Constants$root.C_INT$LAYOUT.withName("st_flags"),
        Constants$root.C_INT$LAYOUT.withName("st_gen")
    ).withName("ostat");
    public static MemoryLayout $LAYOUT() {
        return ostat.$struct$LAYOUT;
    }
    static final VarHandle st_dev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_dev"));
    public static VarHandle st_dev$VH() {
        return ostat.st_dev$VH;
    }
    public static short st_dev$get(MemorySegment seg) {
        return (short)ostat.st_dev$VH.get(seg);
    }
    public static void st_dev$set( MemorySegment seg, short x) {
        ostat.st_dev$VH.set(seg, x);
    }
    public static short st_dev$get(MemorySegment seg, long index) {
        return (short)ostat.st_dev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_dev$set(MemorySegment seg, long index, short x) {
        ostat.st_dev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_ino$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_ino"));
    public static VarHandle st_ino$VH() {
        return ostat.st_ino$VH;
    }
    public static long st_ino$get(MemorySegment seg) {
        return (long)ostat.st_ino$VH.get(seg);
    }
    public static void st_ino$set( MemorySegment seg, long x) {
        ostat.st_ino$VH.set(seg, x);
    }
    public static long st_ino$get(MemorySegment seg, long index) {
        return (long)ostat.st_ino$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_ino$set(MemorySegment seg, long index, long x) {
        ostat.st_ino$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_mode"));
    public static VarHandle st_mode$VH() {
        return ostat.st_mode$VH;
    }
    public static short st_mode$get(MemorySegment seg) {
        return (short)ostat.st_mode$VH.get(seg);
    }
    public static void st_mode$set( MemorySegment seg, short x) {
        ostat.st_mode$VH.set(seg, x);
    }
    public static short st_mode$get(MemorySegment seg, long index) {
        return (short)ostat.st_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_mode$set(MemorySegment seg, long index, short x) {
        ostat.st_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_nlink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_nlink"));
    public static VarHandle st_nlink$VH() {
        return ostat.st_nlink$VH;
    }
    public static short st_nlink$get(MemorySegment seg) {
        return (short)ostat.st_nlink$VH.get(seg);
    }
    public static void st_nlink$set( MemorySegment seg, short x) {
        ostat.st_nlink$VH.set(seg, x);
    }
    public static short st_nlink$get(MemorySegment seg, long index) {
        return (short)ostat.st_nlink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_nlink$set(MemorySegment seg, long index, short x) {
        ostat.st_nlink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_uid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_uid"));
    public static VarHandle st_uid$VH() {
        return ostat.st_uid$VH;
    }
    public static short st_uid$get(MemorySegment seg) {
        return (short)ostat.st_uid$VH.get(seg);
    }
    public static void st_uid$set( MemorySegment seg, short x) {
        ostat.st_uid$VH.set(seg, x);
    }
    public static short st_uid$get(MemorySegment seg, long index) {
        return (short)ostat.st_uid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_uid$set(MemorySegment seg, long index, short x) {
        ostat.st_uid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_gid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_gid"));
    public static VarHandle st_gid$VH() {
        return ostat.st_gid$VH;
    }
    public static short st_gid$get(MemorySegment seg) {
        return (short)ostat.st_gid$VH.get(seg);
    }
    public static void st_gid$set( MemorySegment seg, short x) {
        ostat.st_gid$VH.set(seg, x);
    }
    public static short st_gid$get(MemorySegment seg, long index) {
        return (short)ostat.st_gid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_gid$set(MemorySegment seg, long index, short x) {
        ostat.st_gid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_rdev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_rdev"));
    public static VarHandle st_rdev$VH() {
        return ostat.st_rdev$VH;
    }
    public static short st_rdev$get(MemorySegment seg) {
        return (short)ostat.st_rdev$VH.get(seg);
    }
    public static void st_rdev$set( MemorySegment seg, short x) {
        ostat.st_rdev$VH.set(seg, x);
    }
    public static short st_rdev$get(MemorySegment seg, long index) {
        return (short)ostat.st_rdev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_rdev$set(MemorySegment seg, long index, short x) {
        ostat.st_rdev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_size"));
    public static VarHandle st_size$VH() {
        return ostat.st_size$VH;
    }
    public static int st_size$get(MemorySegment seg) {
        return (int)ostat.st_size$VH.get(seg);
    }
    public static void st_size$set( MemorySegment seg, int x) {
        ostat.st_size$VH.set(seg, x);
    }
    public static int st_size$get(MemorySegment seg, long index) {
        return (int)ostat.st_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_size$set(MemorySegment seg, long index, int x) {
        ostat.st_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment st_atimespec$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment st_mtimespec$slice(MemorySegment seg) {
        return seg.asSlice(48, 16);
    }
    public static MemorySegment st_ctimespec$slice(MemorySegment seg) {
        return seg.asSlice(64, 16);
    }
    static final VarHandle st_blksize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_blksize"));
    public static VarHandle st_blksize$VH() {
        return ostat.st_blksize$VH;
    }
    public static int st_blksize$get(MemorySegment seg) {
        return (int)ostat.st_blksize$VH.get(seg);
    }
    public static void st_blksize$set( MemorySegment seg, int x) {
        ostat.st_blksize$VH.set(seg, x);
    }
    public static int st_blksize$get(MemorySegment seg, long index) {
        return (int)ostat.st_blksize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_blksize$set(MemorySegment seg, long index, int x) {
        ostat.st_blksize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_blocks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_blocks"));
    public static VarHandle st_blocks$VH() {
        return ostat.st_blocks$VH;
    }
    public static int st_blocks$get(MemorySegment seg) {
        return (int)ostat.st_blocks$VH.get(seg);
    }
    public static void st_blocks$set( MemorySegment seg, int x) {
        ostat.st_blocks$VH.set(seg, x);
    }
    public static int st_blocks$get(MemorySegment seg, long index) {
        return (int)ostat.st_blocks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_blocks$set(MemorySegment seg, long index, int x) {
        ostat.st_blocks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_flags"));
    public static VarHandle st_flags$VH() {
        return ostat.st_flags$VH;
    }
    public static int st_flags$get(MemorySegment seg) {
        return (int)ostat.st_flags$VH.get(seg);
    }
    public static void st_flags$set( MemorySegment seg, int x) {
        ostat.st_flags$VH.set(seg, x);
    }
    public static int st_flags$get(MemorySegment seg, long index) {
        return (int)ostat.st_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_flags$set(MemorySegment seg, long index, int x) {
        ostat.st_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle st_gen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("st_gen"));
    public static VarHandle st_gen$VH() {
        return ostat.st_gen$VH;
    }
    public static int st_gen$get(MemorySegment seg) {
        return (int)ostat.st_gen$VH.get(seg);
    }
    public static void st_gen$set( MemorySegment seg, int x) {
        ostat.st_gen$VH.set(seg, x);
    }
    public static int st_gen$get(MemorySegment seg, long index) {
        return (int)ostat.st_gen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void st_gen$set(MemorySegment seg, long index, int x) {
        ostat.st_gen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


