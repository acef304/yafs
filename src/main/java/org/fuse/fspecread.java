// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class fspecread {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("fsr_flags"),
        Constants$root.C_INT$LAYOUT.withName("reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("fsr_offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("fsr_length")
    ).withName("fspecread");
    public static MemoryLayout $LAYOUT() {
        return fspecread.$struct$LAYOUT;
    }
    static final VarHandle fsr_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fsr_flags"));
    public static VarHandle fsr_flags$VH() {
        return fspecread.fsr_flags$VH;
    }
    public static int fsr_flags$get(MemorySegment seg) {
        return (int)fspecread.fsr_flags$VH.get(seg);
    }
    public static void fsr_flags$set( MemorySegment seg, int x) {
        fspecread.fsr_flags$VH.set(seg, x);
    }
    public static int fsr_flags$get(MemorySegment seg, long index) {
        return (int)fspecread.fsr_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fsr_flags$set(MemorySegment seg, long index, int x) {
        fspecread.fsr_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return fspecread.reserved$VH;
    }
    public static int reserved$get(MemorySegment seg) {
        return (int)fspecread.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, int x) {
        fspecread.reserved$VH.set(seg, x);
    }
    public static int reserved$get(MemorySegment seg, long index) {
        return (int)fspecread.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, int x) {
        fspecread.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fsr_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fsr_offset"));
    public static VarHandle fsr_offset$VH() {
        return fspecread.fsr_offset$VH;
    }
    public static long fsr_offset$get(MemorySegment seg) {
        return (long)fspecread.fsr_offset$VH.get(seg);
    }
    public static void fsr_offset$set( MemorySegment seg, long x) {
        fspecread.fsr_offset$VH.set(seg, x);
    }
    public static long fsr_offset$get(MemorySegment seg, long index) {
        return (long)fspecread.fsr_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fsr_offset$set(MemorySegment seg, long index, long x) {
        fspecread.fsr_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fsr_length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fsr_length"));
    public static VarHandle fsr_length$VH() {
        return fspecread.fsr_length$VH;
    }
    public static long fsr_length$get(MemorySegment seg) {
        return (long)fspecread.fsr_length$VH.get(seg);
    }
    public static void fsr_length$set( MemorySegment seg, long x) {
        fspecread.fsr_length$VH.set(seg, x);
    }
    public static long fsr_length$get(MemorySegment seg, long index) {
        return (long)fspecread.fsr_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fsr_length$set(MemorySegment seg, long index, long x) {
        fspecread.fsr_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


