// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class au_tid_addr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("at_port"),
        Constants$root.C_INT$LAYOUT.withName("at_type"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("at_addr")
    ).withName("au_tid_addr");
    public static MemoryLayout $LAYOUT() {
        return au_tid_addr.$struct$LAYOUT;
    }
    static final VarHandle at_port$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("at_port"));
    public static VarHandle at_port$VH() {
        return au_tid_addr.at_port$VH;
    }
    public static int at_port$get(MemorySegment seg) {
        return (int)au_tid_addr.at_port$VH.get(seg);
    }
    public static void at_port$set( MemorySegment seg, int x) {
        au_tid_addr.at_port$VH.set(seg, x);
    }
    public static int at_port$get(MemorySegment seg, long index) {
        return (int)au_tid_addr.at_port$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void at_port$set(MemorySegment seg, long index, int x) {
        au_tid_addr.at_port$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle at_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("at_type"));
    public static VarHandle at_type$VH() {
        return au_tid_addr.at_type$VH;
    }
    public static int at_type$get(MemorySegment seg) {
        return (int)au_tid_addr.at_type$VH.get(seg);
    }
    public static void at_type$set( MemorySegment seg, int x) {
        au_tid_addr.at_type$VH.set(seg, x);
    }
    public static int at_type$get(MemorySegment seg, long index) {
        return (int)au_tid_addr.at_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void at_type$set(MemorySegment seg, long index, int x) {
        au_tid_addr.at_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment at_addr$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


