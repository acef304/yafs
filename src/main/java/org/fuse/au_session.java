// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class au_session {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("as_aia_p"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("am_success"),
            Constants$root.C_INT$LAYOUT.withName("am_failure")
        ).withName("as_mask")
    ).withName("au_session");
    public static MemoryLayout $LAYOUT() {
        return au_session.$struct$LAYOUT;
    }
    static final VarHandle as_aia_p$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("as_aia_p"));
    public static VarHandle as_aia_p$VH() {
        return au_session.as_aia_p$VH;
    }
    public static MemoryAddress as_aia_p$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)au_session.as_aia_p$VH.get(seg);
    }
    public static void as_aia_p$set( MemorySegment seg, MemoryAddress x) {
        au_session.as_aia_p$VH.set(seg, x);
    }
    public static MemoryAddress as_aia_p$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)au_session.as_aia_p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void as_aia_p$set(MemorySegment seg, long index, MemoryAddress x) {
        au_session.as_aia_p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment as_mask$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


