// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class mach_port_options {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("mpl_qlimit")
        ).withName("mpl"),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG_LONG$LAYOUT).withName("reserved"),
            Constants$root.C_INT$LAYOUT.withName("work_interval_port"),
            Constants$root.C_POINTER$LAYOUT.withName("service_port_info"),
            Constants$root.C_INT$LAYOUT.withName("service_port_name")
        ).withName("$anon$0")
    ).withName("mach_port_options");
    public static MemoryLayout $LAYOUT() {
        return mach_port_options.$struct$LAYOUT;
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return mach_port_options.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)mach_port_options.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        mach_port_options.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)mach_port_options.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        mach_port_options.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment mpl$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static MemorySegment reserved$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle work_interval_port$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("work_interval_port"));
    public static VarHandle work_interval_port$VH() {
        return mach_port_options.work_interval_port$VH;
    }
    public static int work_interval_port$get(MemorySegment seg) {
        return (int)mach_port_options.work_interval_port$VH.get(seg);
    }
    public static void work_interval_port$set( MemorySegment seg, int x) {
        mach_port_options.work_interval_port$VH.set(seg, x);
    }
    public static int work_interval_port$get(MemorySegment seg, long index) {
        return (int)mach_port_options.work_interval_port$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void work_interval_port$set(MemorySegment seg, long index, int x) {
        mach_port_options.work_interval_port$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle service_port_info$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("service_port_info"));
    public static VarHandle service_port_info$VH() {
        return mach_port_options.service_port_info$VH;
    }
    public static MemoryAddress service_port_info$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)mach_port_options.service_port_info$VH.get(seg);
    }
    public static void service_port_info$set( MemorySegment seg, MemoryAddress x) {
        mach_port_options.service_port_info$VH.set(seg, x);
    }
    public static MemoryAddress service_port_info$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)mach_port_options.service_port_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void service_port_info$set(MemorySegment seg, long index, MemoryAddress x) {
        mach_port_options.service_port_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle service_port_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("service_port_name"));
    public static VarHandle service_port_name$VH() {
        return mach_port_options.service_port_name$VH;
    }
    public static int service_port_name$get(MemorySegment seg) {
        return (int)mach_port_options.service_port_name$VH.get(seg);
    }
    public static void service_port_name$set( MemorySegment seg, int x) {
        mach_port_options.service_port_name$VH.set(seg, x);
    }
    public static int service_port_name$get(MemorySegment seg, long index) {
        return (int)mach_port_options.service_port_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void service_port_name$set(MemorySegment seg, long index, int x) {
        mach_port_options.service_port_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


