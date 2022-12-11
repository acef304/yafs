// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class fuse_buf {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("size"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("mem"),
        Constants$root.C_INT$LAYOUT.withName("fd"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pos")
    ).withName("fuse_buf");
    public static MemoryLayout $LAYOUT() {
        return fuse_buf.$struct$LAYOUT;
    }
    static final VarHandle size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("size"));
    public static VarHandle size$VH() {
        return fuse_buf.size$VH;
    }
    public static long size$get(MemorySegment seg) {
        return (long)fuse_buf.size$VH.get(seg);
    }
    public static void size$set( MemorySegment seg, long x) {
        fuse_buf.size$VH.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)fuse_buf.size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        fuse_buf.size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return fuse_buf.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)fuse_buf.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        fuse_buf.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)fuse_buf.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        fuse_buf.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mem"));
    public static VarHandle mem$VH() {
        return fuse_buf.mem$VH;
    }
    public static MemoryAddress mem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)fuse_buf.mem$VH.get(seg);
    }
    public static void mem$set( MemorySegment seg, MemoryAddress x) {
        fuse_buf.mem$VH.set(seg, x);
    }
    public static MemoryAddress mem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)fuse_buf.mem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mem$set(MemorySegment seg, long index, MemoryAddress x) {
        fuse_buf.mem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fd"));
    public static VarHandle fd$VH() {
        return fuse_buf.fd$VH;
    }
    public static int fd$get(MemorySegment seg) {
        return (int)fuse_buf.fd$VH.get(seg);
    }
    public static void fd$set( MemorySegment seg, int x) {
        fuse_buf.fd$VH.set(seg, x);
    }
    public static int fd$get(MemorySegment seg, long index) {
        return (int)fuse_buf.fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fd$set(MemorySegment seg, long index, int x) {
        fuse_buf.fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pos"));
    public static VarHandle pos$VH() {
        return fuse_buf.pos$VH;
    }
    public static long pos$get(MemorySegment seg) {
        return (long)fuse_buf.pos$VH.get(seg);
    }
    public static void pos$set( MemorySegment seg, long x) {
        fuse_buf.pos$VH.set(seg, x);
    }
    public static long pos$get(MemorySegment seg, long index) {
        return (long)fuse_buf.pos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pos$set(MemorySegment seg, long index, long x) {
        fuse_buf.pos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


