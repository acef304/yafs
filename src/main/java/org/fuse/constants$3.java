// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor __darwin_check_fd_set_overflow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __darwin_check_fd_set_overflow$MH = RuntimeHelper.downcallHandle(
        "__darwin_check_fd_set_overflow",
        constants$3.__darwin_check_fd_set_overflow$FUNC
    );
    static final FunctionDescriptor __darwin_check_fd_set$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __darwin_check_fd_set$MH = RuntimeHelper.downcallHandle(
        "__darwin_check_fd_set",
        constants$3.__darwin_check_fd_set$FUNC
    );
    static final FunctionDescriptor __darwin_fd_isset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __darwin_fd_isset$MH = RuntimeHelper.downcallHandle(
        "__darwin_fd_isset",
        constants$3.__darwin_fd_isset$FUNC
    );
    static final FunctionDescriptor __darwin_fd_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __darwin_fd_set$MH = RuntimeHelper.downcallHandle(
        "__darwin_fd_set",
        constants$3.__darwin_fd_set$FUNC
    );
    static final FunctionDescriptor __darwin_fd_clr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __darwin_fd_clr$MH = RuntimeHelper.downcallHandle(
        "__darwin_fd_clr",
        constants$3.__darwin_fd_clr$FUNC
    );
    static final FunctionDescriptor chmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle chmod$MH = RuntimeHelper.downcallHandle(
        "chmod",
        constants$3.chmod$FUNC
    );
}


