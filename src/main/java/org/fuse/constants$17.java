// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$17 {

    static final FunctionDescriptor clock_settime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_settime$MH = RuntimeHelper.downcallHandle(
        "clock_settime",
        constants$17.clock_settime$FUNC
    );
    static final FunctionDescriptor timespec_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle timespec_get$MH = RuntimeHelper.downcallHandle(
        "timespec_get",
        constants$17.timespec_get$FUNC
    );
    static final FunctionDescriptor utime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle utime$MH = RuntimeHelper.downcallHandle(
        "utime",
        constants$17.utime$FUNC
    );
    static final FunctionDescriptor fstatvfs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fstatvfs$MH = RuntimeHelper.downcallHandle(
        "fstatvfs",
        constants$17.fstatvfs$FUNC
    );
    static final FunctionDescriptor statvfs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle statvfs$MH = RuntimeHelper.downcallHandle(
        "statvfs",
        constants$17.statvfs$FUNC
    );
    static final FunctionDescriptor readv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle readv$MH = RuntimeHelper.downcallHandle(
        "readv",
        constants$17.readv$FUNC
    );
}


