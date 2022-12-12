// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __darwin_mcontext32 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__exception"),
            Constants$root.C_INT$LAYOUT.withName("__fsr"),
            Constants$root.C_INT$LAYOUT.withName("__far")
        ).withName("__es"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(13, Constants$root.C_INT$LAYOUT).withName("__r"),
            Constants$root.C_INT$LAYOUT.withName("__sp"),
            Constants$root.C_INT$LAYOUT.withName("__lr"),
            Constants$root.C_INT$LAYOUT.withName("__pc"),
            Constants$root.C_INT$LAYOUT.withName("__cpsr")
        ).withName("__ss"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, Constants$root.C_INT$LAYOUT).withName("__r"),
            Constants$root.C_INT$LAYOUT.withName("__fpscr")
        ).withName("__fs")
    ).withName("__darwin_mcontext32");
    public static MemoryLayout $LAYOUT() {
        return __darwin_mcontext32.$struct$LAYOUT;
    }
    public static MemorySegment __es$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment __ss$slice(MemorySegment seg) {
        return seg.asSlice(12, 68);
    }
    public static MemorySegment __fs$slice(MemorySegment seg) {
        return seg.asSlice(80, 260);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

