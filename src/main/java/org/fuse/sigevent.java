// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class sigevent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("sigev_notify"),
        Constants$root.C_INT$LAYOUT.withName("sigev_signo"),
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("sival_int"),
            Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
        ).withName("sigev_value"),
        Constants$root.C_POINTER$LAYOUT.withName("sigev_notify_function"),
        Constants$root.C_POINTER$LAYOUT.withName("sigev_notify_attributes")
    ).withName("sigevent");
    public static MemoryLayout $LAYOUT() {
        return sigevent.$struct$LAYOUT;
    }
    static final VarHandle sigev_notify$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sigev_notify"));
    public static VarHandle sigev_notify$VH() {
        return sigevent.sigev_notify$VH;
    }
    public static int sigev_notify$get(MemorySegment seg) {
        return (int)sigevent.sigev_notify$VH.get(seg);
    }
    public static void sigev_notify$set( MemorySegment seg, int x) {
        sigevent.sigev_notify$VH.set(seg, x);
    }
    public static int sigev_notify$get(MemorySegment seg, long index) {
        return (int)sigevent.sigev_notify$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sigev_notify$set(MemorySegment seg, long index, int x) {
        sigevent.sigev_notify$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sigev_signo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sigev_signo"));
    public static VarHandle sigev_signo$VH() {
        return sigevent.sigev_signo$VH;
    }
    public static int sigev_signo$get(MemorySegment seg) {
        return (int)sigevent.sigev_signo$VH.get(seg);
    }
    public static void sigev_signo$set( MemorySegment seg, int x) {
        sigevent.sigev_signo$VH.set(seg, x);
    }
    public static int sigev_signo$get(MemorySegment seg, long index) {
        return (int)sigevent.sigev_signo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sigev_signo$set(MemorySegment seg, long index, int x) {
        sigevent.sigev_signo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sigev_value$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final FunctionDescriptor sigev_notify_function$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("sival_int"),
            Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
        ).withName("sigval")
    );
    static final MethodHandle sigev_notify_function$MH = RuntimeHelper.downcallHandle(
        sigevent.sigev_notify_function$FUNC
    );
    public interface sigev_notify_function {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(sigev_notify_function fi, MemorySession session) {
            return RuntimeHelper.upcallStub(sigev_notify_function.class, fi, sigevent.sigev_notify_function$FUNC, session);
        }
        static sigev_notify_function ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    sigevent.sigev_notify_function$MH.invokeExact((Addressable)symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle sigev_notify_function$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sigev_notify_function"));
    public static VarHandle sigev_notify_function$VH() {
        return sigevent.sigev_notify_function$VH;
    }
    public static MemoryAddress sigev_notify_function$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)sigevent.sigev_notify_function$VH.get(seg);
    }
    public static void sigev_notify_function$set( MemorySegment seg, MemoryAddress x) {
        sigevent.sigev_notify_function$VH.set(seg, x);
    }
    public static MemoryAddress sigev_notify_function$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)sigevent.sigev_notify_function$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sigev_notify_function$set(MemorySegment seg, long index, MemoryAddress x) {
        sigevent.sigev_notify_function$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static sigev_notify_function sigev_notify_function (MemorySegment segment, MemorySession session) {
        return sigev_notify_function.ofAddress(sigev_notify_function$get(segment), session);
    }
    static final VarHandle sigev_notify_attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sigev_notify_attributes"));
    public static VarHandle sigev_notify_attributes$VH() {
        return sigevent.sigev_notify_attributes$VH;
    }
    public static MemoryAddress sigev_notify_attributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)sigevent.sigev_notify_attributes$VH.get(seg);
    }
    public static void sigev_notify_attributes$set( MemorySegment seg, MemoryAddress x) {
        sigevent.sigev_notify_attributes$VH.set(seg, x);
    }
    public static MemoryAddress sigev_notify_attributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)sigevent.sigev_notify_attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sigev_notify_attributes$set(MemorySegment seg, long index, MemoryAddress x) {
        sigevent.sigev_notify_attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


