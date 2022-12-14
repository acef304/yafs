// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __darwin_ucontext {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("uc_onstack"),
        Constants$root.C_INT$LAYOUT.withName("uc_sigmask"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("ss_sp"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ss_size"),
            Constants$root.C_INT$LAYOUT.withName("ss_flags"),
            MemoryLayout.paddingLayout(32)
        ).withName("uc_stack"),
        Constants$root.C_POINTER$LAYOUT.withName("uc_link"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("uc_mcsize"),
        Constants$root.C_POINTER$LAYOUT.withName("uc_mcontext")
    ).withName("__darwin_ucontext");
    public static MemoryLayout $LAYOUT() {
        return __darwin_ucontext.$struct$LAYOUT;
    }
    static final VarHandle uc_onstack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uc_onstack"));
    public static VarHandle uc_onstack$VH() {
        return __darwin_ucontext.uc_onstack$VH;
    }
    public static int uc_onstack$get(MemorySegment seg) {
        return (int)__darwin_ucontext.uc_onstack$VH.get(seg);
    }
    public static void uc_onstack$set( MemorySegment seg, int x) {
        __darwin_ucontext.uc_onstack$VH.set(seg, x);
    }
    public static int uc_onstack$get(MemorySegment seg, long index) {
        return (int)__darwin_ucontext.uc_onstack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uc_onstack$set(MemorySegment seg, long index, int x) {
        __darwin_ucontext.uc_onstack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uc_sigmask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uc_sigmask"));
    public static VarHandle uc_sigmask$VH() {
        return __darwin_ucontext.uc_sigmask$VH;
    }
    public static int uc_sigmask$get(MemorySegment seg) {
        return (int)__darwin_ucontext.uc_sigmask$VH.get(seg);
    }
    public static void uc_sigmask$set( MemorySegment seg, int x) {
        __darwin_ucontext.uc_sigmask$VH.set(seg, x);
    }
    public static int uc_sigmask$get(MemorySegment seg, long index) {
        return (int)__darwin_ucontext.uc_sigmask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uc_sigmask$set(MemorySegment seg, long index, int x) {
        __darwin_ucontext.uc_sigmask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment uc_stack$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    static final VarHandle uc_link$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uc_link"));
    public static VarHandle uc_link$VH() {
        return __darwin_ucontext.uc_link$VH;
    }
    public static MemoryAddress uc_link$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__darwin_ucontext.uc_link$VH.get(seg);
    }
    public static void uc_link$set( MemorySegment seg, MemoryAddress x) {
        __darwin_ucontext.uc_link$VH.set(seg, x);
    }
    public static MemoryAddress uc_link$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__darwin_ucontext.uc_link$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uc_link$set(MemorySegment seg, long index, MemoryAddress x) {
        __darwin_ucontext.uc_link$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uc_mcsize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uc_mcsize"));
    public static VarHandle uc_mcsize$VH() {
        return __darwin_ucontext.uc_mcsize$VH;
    }
    public static long uc_mcsize$get(MemorySegment seg) {
        return (long)__darwin_ucontext.uc_mcsize$VH.get(seg);
    }
    public static void uc_mcsize$set( MemorySegment seg, long x) {
        __darwin_ucontext.uc_mcsize$VH.set(seg, x);
    }
    public static long uc_mcsize$get(MemorySegment seg, long index) {
        return (long)__darwin_ucontext.uc_mcsize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uc_mcsize$set(MemorySegment seg, long index, long x) {
        __darwin_ucontext.uc_mcsize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uc_mcontext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uc_mcontext"));
    public static VarHandle uc_mcontext$VH() {
        return __darwin_ucontext.uc_mcontext$VH;
    }
    public static MemoryAddress uc_mcontext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__darwin_ucontext.uc_mcontext$VH.get(seg);
    }
    public static void uc_mcontext$set( MemorySegment seg, MemoryAddress x) {
        __darwin_ucontext.uc_mcontext$VH.set(seg, x);
    }
    public static MemoryAddress uc_mcontext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__darwin_ucontext.uc_mcontext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uc_mcontext$set(MemorySegment seg, long index, MemoryAddress x) {
        __darwin_ucontext.uc_mcontext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


