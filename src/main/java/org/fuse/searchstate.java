// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class searchstate {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ss_union_flags"),
        Constants$root.C_INT$LAYOUT.withName("ss_union_layer"),
        MemoryLayout.sequenceLayout(548, Constants$root.C_CHAR$LAYOUT).withName("ss_fsstate")
    ).withName("searchstate");
    public static MemoryLayout $LAYOUT() {
        return searchstate.$struct$LAYOUT;
    }
    static final VarHandle ss_union_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_union_flags"));
    public static VarHandle ss_union_flags$VH() {
        return searchstate.ss_union_flags$VH;
    }
    public static int ss_union_flags$get(MemorySegment seg) {
        return (int)searchstate.ss_union_flags$VH.get(seg);
    }
    public static void ss_union_flags$set( MemorySegment seg, int x) {
        searchstate.ss_union_flags$VH.set(seg, x);
    }
    public static int ss_union_flags$get(MemorySegment seg, long index) {
        return (int)searchstate.ss_union_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_union_flags$set(MemorySegment seg, long index, int x) {
        searchstate.ss_union_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_union_layer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_union_layer"));
    public static VarHandle ss_union_layer$VH() {
        return searchstate.ss_union_layer$VH;
    }
    public static int ss_union_layer$get(MemorySegment seg) {
        return (int)searchstate.ss_union_layer$VH.get(seg);
    }
    public static void ss_union_layer$set( MemorySegment seg, int x) {
        searchstate.ss_union_layer$VH.set(seg, x);
    }
    public static int ss_union_layer$get(MemorySegment seg, long index) {
        return (int)searchstate.ss_union_layer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_union_layer$set(MemorySegment seg, long index, int x) {
        searchstate.ss_union_layer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ss_fsstate$slice(MemorySegment seg) {
        return seg.asSlice(8, 548);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


