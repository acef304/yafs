// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor audit_session_join$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle audit_session_join$MH = RuntimeHelper.downcallHandle(
        "audit_session_join",
        constants$21.audit_session_join$FUNC
    );
    static final FunctionDescriptor audit_session_port$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle audit_session_port$MH = RuntimeHelper.downcallHandle(
        "audit_session_port",
        constants$21.audit_session_port$FUNC
    );
    static final FunctionDescriptor adjtime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle adjtime$MH = RuntimeHelper.downcallHandle(
        "adjtime",
        constants$21.adjtime$FUNC
    );
    static final FunctionDescriptor futimes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle futimes$MH = RuntimeHelper.downcallHandle(
        "futimes",
        constants$21.futimes$FUNC
    );
    static final FunctionDescriptor lutimes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lutimes$MH = RuntimeHelper.downcallHandle(
        "lutimes",
        constants$21.lutimes$FUNC
    );
    static final FunctionDescriptor settimeofday$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle settimeofday$MH = RuntimeHelper.downcallHandle(
        "settimeofday",
        constants$21.settimeofday$FUNC
    );
}


