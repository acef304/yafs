// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class fpunchhole {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("fp_flags"),
        Constants$root.C_INT$LAYOUT.withName("reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("fp_offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("fp_length")
    ).withName("fpunchhole");
    public static MemoryLayout $LAYOUT() {
        return fpunchhole.$struct$LAYOUT;
    }
    static final VarHandle fp_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fp_flags"));
    public static VarHandle fp_flags$VH() {
        return fpunchhole.fp_flags$VH;
    }
    public static int fp_flags$get(MemorySegment seg) {
        return (int)fpunchhole.fp_flags$VH.get(seg);
    }
    public static void fp_flags$set( MemorySegment seg, int x) {
        fpunchhole.fp_flags$VH.set(seg, x);
    }
    public static int fp_flags$get(MemorySegment seg, long index) {
        return (int)fpunchhole.fp_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fp_flags$set(MemorySegment seg, long index, int x) {
        fpunchhole.fp_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return fpunchhole.reserved$VH;
    }
    public static int reserved$get(MemorySegment seg) {
        return (int)fpunchhole.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, int x) {
        fpunchhole.reserved$VH.set(seg, x);
    }
    public static int reserved$get(MemorySegment seg, long index) {
        return (int)fpunchhole.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, int x) {
        fpunchhole.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fp_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fp_offset"));
    public static VarHandle fp_offset$VH() {
        return fpunchhole.fp_offset$VH;
    }
    public static long fp_offset$get(MemorySegment seg) {
        return (long)fpunchhole.fp_offset$VH.get(seg);
    }
    public static void fp_offset$set( MemorySegment seg, long x) {
        fpunchhole.fp_offset$VH.set(seg, x);
    }
    public static long fp_offset$get(MemorySegment seg, long index) {
        return (long)fpunchhole.fp_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fp_offset$set(MemorySegment seg, long index, long x) {
        fpunchhole.fp_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fp_length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fp_length"));
    public static VarHandle fp_length$VH() {
        return fpunchhole.fp_length$VH;
    }
    public static long fp_length$get(MemorySegment seg) {
        return (long)fpunchhole.fp_length$VH.get(seg);
    }
    public static void fp_length$set( MemorySegment seg, long x) {
        fpunchhole.fp_length$VH.set(seg, x);
    }
    public static long fp_length$get(MemorySegment seg, long index) {
        return (long)fpunchhole.fp_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fp_length$set(MemorySegment seg, long index, long x) {
        fpunchhole.fp_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

