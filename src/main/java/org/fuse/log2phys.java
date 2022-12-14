// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class log2phys {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("l2p_flags"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("l2p_contigbytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("l2p_devoffset")
    ).withName("log2phys");
    public static MemoryLayout $LAYOUT() {
        return log2phys.$struct$LAYOUT;
    }
    static final VarHandle l2p_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l2p_flags"));
    public static VarHandle l2p_flags$VH() {
        return log2phys.l2p_flags$VH;
    }
    public static int l2p_flags$get(MemorySegment seg) {
        return (int)log2phys.l2p_flags$VH.get(seg);
    }
    public static void l2p_flags$set( MemorySegment seg, int x) {
        log2phys.l2p_flags$VH.set(seg, x);
    }
    public static int l2p_flags$get(MemorySegment seg, long index) {
        return (int)log2phys.l2p_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l2p_flags$set(MemorySegment seg, long index, int x) {
        log2phys.l2p_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l2p_contigbytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l2p_contigbytes"));
    public static VarHandle l2p_contigbytes$VH() {
        return log2phys.l2p_contigbytes$VH;
    }
    public static long l2p_contigbytes$get(MemorySegment seg) {
        return (long)log2phys.l2p_contigbytes$VH.get(seg);
    }
    public static void l2p_contigbytes$set( MemorySegment seg, long x) {
        log2phys.l2p_contigbytes$VH.set(seg, x);
    }
    public static long l2p_contigbytes$get(MemorySegment seg, long index) {
        return (long)log2phys.l2p_contigbytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l2p_contigbytes$set(MemorySegment seg, long index, long x) {
        log2phys.l2p_contigbytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l2p_devoffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l2p_devoffset"));
    public static VarHandle l2p_devoffset$VH() {
        return log2phys.l2p_devoffset$VH;
    }
    public static long l2p_devoffset$get(MemorySegment seg) {
        return (long)log2phys.l2p_devoffset$VH.get(seg);
    }
    public static void l2p_devoffset$set( MemorySegment seg, long x) {
        log2phys.l2p_devoffset$VH.set(seg, x);
    }
    public static long l2p_devoffset$get(MemorySegment seg, long index) {
        return (long)log2phys.l2p_devoffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l2p_devoffset$set(MemorySegment seg, long index, long x) {
        log2phys.l2p_devoffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


