// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$13 {

    static final FunctionDescriptor clock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle clock$MH = RuntimeHelper.downcallHandle(
        "clock",
        constants$13.clock$FUNC
    );
    static final FunctionDescriptor ctime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ctime$MH = RuntimeHelper.downcallHandle(
        "ctime",
        constants$13.ctime$FUNC
    );
    static final FunctionDescriptor difftime$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle difftime$MH = RuntimeHelper.downcallHandle(
        "difftime",
        constants$13.difftime$FUNC
    );
    static final FunctionDescriptor getdate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getdate$MH = RuntimeHelper.downcallHandle(
        "getdate",
        constants$13.getdate$FUNC
    );
    static final FunctionDescriptor gmtime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gmtime$MH = RuntimeHelper.downcallHandle(
        "gmtime",
        constants$13.gmtime$FUNC
    );
    static final FunctionDescriptor localtime$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle localtime$MH = RuntimeHelper.downcallHandle(
        "localtime",
        constants$13.localtime$FUNC
    );
}

