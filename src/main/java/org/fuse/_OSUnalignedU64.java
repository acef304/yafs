// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OSUnalignedU64 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("__val")
    ).withName("_OSUnalignedU64");
    public static MemoryLayout $LAYOUT() {
        return _OSUnalignedU64.$struct$LAYOUT;
    }
    static final VarHandle __val$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__val"));
    public static VarHandle __val$VH() {
        return _OSUnalignedU64.__val$VH;
    }
    public static long __val$get(MemorySegment seg) {
        return (long)_OSUnalignedU64.__val$VH.get(seg);
    }
    public static void __val$set( MemorySegment seg, long x) {
        _OSUnalignedU64.__val$VH.set(seg, x);
    }
    public static long __val$get(MemorySegment seg, long index) {
        return (long)_OSUnalignedU64.__val$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __val$set(MemorySegment seg, long index, long x) {
        _OSUnalignedU64.__val$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


