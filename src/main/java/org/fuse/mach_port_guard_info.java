// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class mach_port_guard_info {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("mpgi_guard")
    ).withName("mach_port_guard_info");
    public static MemoryLayout $LAYOUT() {
        return mach_port_guard_info.$struct$LAYOUT;
    }
    static final VarHandle mpgi_guard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mpgi_guard"));
    public static VarHandle mpgi_guard$VH() {
        return mach_port_guard_info.mpgi_guard$VH;
    }
    public static long mpgi_guard$get(MemorySegment seg) {
        return (long)mach_port_guard_info.mpgi_guard$VH.get(seg);
    }
    public static void mpgi_guard$set( MemorySegment seg, long x) {
        mach_port_guard_info.mpgi_guard$VH.set(seg, x);
    }
    public static long mpgi_guard$get(MemorySegment seg, long index) {
        return (long)mach_port_guard_info.mpgi_guard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mpgi_guard$set(MemorySegment seg, long index, long x) {
        mach_port_guard_info.mpgi_guard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


