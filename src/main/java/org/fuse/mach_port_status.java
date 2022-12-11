// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class mach_port_status {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("mps_pset"),
        Constants$root.C_INT$LAYOUT.withName("mps_seqno"),
        Constants$root.C_INT$LAYOUT.withName("mps_mscount"),
        Constants$root.C_INT$LAYOUT.withName("mps_qlimit"),
        Constants$root.C_INT$LAYOUT.withName("mps_msgcount"),
        Constants$root.C_INT$LAYOUT.withName("mps_sorights"),
        Constants$root.C_INT$LAYOUT.withName("mps_srights"),
        Constants$root.C_INT$LAYOUT.withName("mps_pdrequest"),
        Constants$root.C_INT$LAYOUT.withName("mps_nsrequest"),
        Constants$root.C_INT$LAYOUT.withName("mps_flags")
    ).withName("mach_port_status");
    public static MemoryLayout $LAYOUT() {
        return mach_port_status.$struct$LAYOUT;
    }
    static final VarHandle mps_pset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_pset"));
    public static VarHandle mps_pset$VH() {
        return mach_port_status.mps_pset$VH;
    }
    public static int mps_pset$get(MemorySegment seg) {
        return (int)mach_port_status.mps_pset$VH.get(seg);
    }
    public static void mps_pset$set( MemorySegment seg, int x) {
        mach_port_status.mps_pset$VH.set(seg, x);
    }
    public static int mps_pset$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_pset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_pset$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_pset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_seqno$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_seqno"));
    public static VarHandle mps_seqno$VH() {
        return mach_port_status.mps_seqno$VH;
    }
    public static int mps_seqno$get(MemorySegment seg) {
        return (int)mach_port_status.mps_seqno$VH.get(seg);
    }
    public static void mps_seqno$set( MemorySegment seg, int x) {
        mach_port_status.mps_seqno$VH.set(seg, x);
    }
    public static int mps_seqno$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_seqno$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_seqno$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_seqno$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_mscount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_mscount"));
    public static VarHandle mps_mscount$VH() {
        return mach_port_status.mps_mscount$VH;
    }
    public static int mps_mscount$get(MemorySegment seg) {
        return (int)mach_port_status.mps_mscount$VH.get(seg);
    }
    public static void mps_mscount$set( MemorySegment seg, int x) {
        mach_port_status.mps_mscount$VH.set(seg, x);
    }
    public static int mps_mscount$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_mscount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_mscount$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_mscount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_qlimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_qlimit"));
    public static VarHandle mps_qlimit$VH() {
        return mach_port_status.mps_qlimit$VH;
    }
    public static int mps_qlimit$get(MemorySegment seg) {
        return (int)mach_port_status.mps_qlimit$VH.get(seg);
    }
    public static void mps_qlimit$set( MemorySegment seg, int x) {
        mach_port_status.mps_qlimit$VH.set(seg, x);
    }
    public static int mps_qlimit$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_qlimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_qlimit$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_qlimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_msgcount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_msgcount"));
    public static VarHandle mps_msgcount$VH() {
        return mach_port_status.mps_msgcount$VH;
    }
    public static int mps_msgcount$get(MemorySegment seg) {
        return (int)mach_port_status.mps_msgcount$VH.get(seg);
    }
    public static void mps_msgcount$set( MemorySegment seg, int x) {
        mach_port_status.mps_msgcount$VH.set(seg, x);
    }
    public static int mps_msgcount$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_msgcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_msgcount$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_msgcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_sorights$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_sorights"));
    public static VarHandle mps_sorights$VH() {
        return mach_port_status.mps_sorights$VH;
    }
    public static int mps_sorights$get(MemorySegment seg) {
        return (int)mach_port_status.mps_sorights$VH.get(seg);
    }
    public static void mps_sorights$set( MemorySegment seg, int x) {
        mach_port_status.mps_sorights$VH.set(seg, x);
    }
    public static int mps_sorights$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_sorights$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_sorights$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_sorights$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_srights$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_srights"));
    public static VarHandle mps_srights$VH() {
        return mach_port_status.mps_srights$VH;
    }
    public static int mps_srights$get(MemorySegment seg) {
        return (int)mach_port_status.mps_srights$VH.get(seg);
    }
    public static void mps_srights$set( MemorySegment seg, int x) {
        mach_port_status.mps_srights$VH.set(seg, x);
    }
    public static int mps_srights$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_srights$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_srights$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_srights$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_pdrequest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_pdrequest"));
    public static VarHandle mps_pdrequest$VH() {
        return mach_port_status.mps_pdrequest$VH;
    }
    public static int mps_pdrequest$get(MemorySegment seg) {
        return (int)mach_port_status.mps_pdrequest$VH.get(seg);
    }
    public static void mps_pdrequest$set( MemorySegment seg, int x) {
        mach_port_status.mps_pdrequest$VH.set(seg, x);
    }
    public static int mps_pdrequest$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_pdrequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_pdrequest$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_pdrequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_nsrequest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_nsrequest"));
    public static VarHandle mps_nsrequest$VH() {
        return mach_port_status.mps_nsrequest$VH;
    }
    public static int mps_nsrequest$get(MemorySegment seg) {
        return (int)mach_port_status.mps_nsrequest$VH.get(seg);
    }
    public static void mps_nsrequest$set( MemorySegment seg, int x) {
        mach_port_status.mps_nsrequest$VH.set(seg, x);
    }
    public static int mps_nsrequest$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_nsrequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_nsrequest$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_nsrequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mps_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mps_flags"));
    public static VarHandle mps_flags$VH() {
        return mach_port_status.mps_flags$VH;
    }
    public static int mps_flags$get(MemorySegment seg) {
        return (int)mach_port_status.mps_flags$VH.get(seg);
    }
    public static void mps_flags$set( MemorySegment seg, int x) {
        mach_port_status.mps_flags$VH.set(seg, x);
    }
    public static int mps_flags$get(MemorySegment seg, long index) {
        return (int)mach_port_status.mps_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mps_flags$set(MemorySegment seg, long index, int x) {
        mach_port_status.mps_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


