// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor fuse_getgroups$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_getgroups$MH = RuntimeHelper.downcallHandle(
        "fuse_getgroups",
        constants$27.fuse_getgroups$FUNC
    );
    static final FunctionDescriptor fuse_interrupted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle fuse_interrupted$MH = RuntimeHelper.downcallHandle(
        "fuse_interrupted",
        constants$27.fuse_interrupted$FUNC
    );
    static final FunctionDescriptor fuse_invalidate_path$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_invalidate_path$MH = RuntimeHelper.downcallHandle(
        "fuse_invalidate_path",
        constants$27.fuse_invalidate_path$FUNC
    );
    static final FunctionDescriptor fuse_invalidate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_invalidate$MH = RuntimeHelper.downcallHandle(
        "fuse_invalidate",
        constants$27.fuse_invalidate$FUNC
    );
    static final FunctionDescriptor fuse_is_lib_option$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_is_lib_option$MH = RuntimeHelper.downcallHandle(
        "fuse_is_lib_option",
        constants$27.fuse_is_lib_option$FUNC
    );
    static final FunctionDescriptor fuse_main_real$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_main_real$MH = RuntimeHelper.downcallHandle(
        "fuse_main_real",
        constants$27.fuse_main_real$FUNC
    );
}


