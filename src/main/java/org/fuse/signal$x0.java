// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface signal$x0 {

    void apply(int _x0);
    static MemorySegment allocate(signal$x0 fi, MemorySession session) {
        return RuntimeHelper.upcallStub(signal$x0.class, fi, constants$18.signal$x0$FUNC, session);
    }
    static signal$x0 ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$19.signal$x0$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

