// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class utimbuf {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("actime"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("modtime")
    ).withName("utimbuf");
    public static MemoryLayout $LAYOUT() {
        return utimbuf.$struct$LAYOUT;
    }
    static final VarHandle actime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("actime"));
    public static VarHandle actime$VH() {
        return utimbuf.actime$VH;
    }
    public static long actime$get(MemorySegment seg) {
        return (long)utimbuf.actime$VH.get(seg);
    }
    public static void actime$set( MemorySegment seg, long x) {
        utimbuf.actime$VH.set(seg, x);
    }
    public static long actime$get(MemorySegment seg, long index) {
        return (long)utimbuf.actime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void actime$set(MemorySegment seg, long index, long x) {
        utimbuf.actime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modtime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modtime"));
    public static VarHandle modtime$VH() {
        return utimbuf.modtime$VH;
    }
    public static long modtime$get(MemorySegment seg) {
        return (long)utimbuf.modtime$VH.get(seg);
    }
    public static void modtime$set( MemorySegment seg, long x) {
        utimbuf.modtime$VH.set(seg, x);
    }
    public static long modtime$get(MemorySegment seg, long index) {
        return (long)utimbuf.modtime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modtime$set(MemorySegment seg, long index, long x) {
        utimbuf.modtime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

