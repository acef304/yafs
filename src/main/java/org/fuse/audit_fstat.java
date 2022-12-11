// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class audit_fstat {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("af_filesz"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("af_currsz")
    ).withName("audit_fstat");
    public static MemoryLayout $LAYOUT() {
        return audit_fstat.$struct$LAYOUT;
    }
    static final VarHandle af_filesz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("af_filesz"));
    public static VarHandle af_filesz$VH() {
        return audit_fstat.af_filesz$VH;
    }
    public static long af_filesz$get(MemorySegment seg) {
        return (long)audit_fstat.af_filesz$VH.get(seg);
    }
    public static void af_filesz$set( MemorySegment seg, long x) {
        audit_fstat.af_filesz$VH.set(seg, x);
    }
    public static long af_filesz$get(MemorySegment seg, long index) {
        return (long)audit_fstat.af_filesz$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void af_filesz$set(MemorySegment seg, long index, long x) {
        audit_fstat.af_filesz$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle af_currsz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("af_currsz"));
    public static VarHandle af_currsz$VH() {
        return audit_fstat.af_currsz$VH;
    }
    public static long af_currsz$get(MemorySegment seg) {
        return (long)audit_fstat.af_currsz$VH.get(seg);
    }
    public static void af_currsz$set( MemorySegment seg, long x) {
        audit_fstat.af_currsz$VH.set(seg, x);
    }
    public static long af_currsz$get(MemorySegment seg, long index) {
        return (long)audit_fstat.af_currsz$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void af_currsz$set(MemorySegment seg, long index, long x) {
        audit_fstat.af_currsz$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


