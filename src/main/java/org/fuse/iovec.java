// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class iovec {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("iov_base"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("iov_len")
    ).withName("iovec");
    public static MemoryLayout $LAYOUT() {
        return iovec.$struct$LAYOUT;
    }
    static final VarHandle iov_base$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iov_base"));
    public static VarHandle iov_base$VH() {
        return iovec.iov_base$VH;
    }
    public static MemoryAddress iov_base$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)iovec.iov_base$VH.get(seg);
    }
    public static void iov_base$set( MemorySegment seg, MemoryAddress x) {
        iovec.iov_base$VH.set(seg, x);
    }
    public static MemoryAddress iov_base$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)iovec.iov_base$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iov_base$set(MemorySegment seg, long index, MemoryAddress x) {
        iovec.iov_base$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iov_len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iov_len"));
    public static VarHandle iov_len$VH() {
        return iovec.iov_len$VH;
    }
    public static long iov_len$get(MemorySegment seg) {
        return (long)iovec.iov_len$VH.get(seg);
    }
    public static void iov_len$set( MemorySegment seg, long x) {
        iovec.iov_len$VH.set(seg, x);
    }
    public static long iov_len$get(MemorySegment seg, long index) {
        return (long)iovec.iov_len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iov_len$set(MemorySegment seg, long index, long x) {
        iovec.iov_len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


