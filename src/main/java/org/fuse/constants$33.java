// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor fuse_fs_lock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_lock$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_lock",
        constants$33.fuse_fs_lock$FUNC
    );
    static final FunctionDescriptor fuse_fs_flock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_flock$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_flock",
        constants$33.fuse_fs_flock$FUNC
    );
    static final FunctionDescriptor fuse_fs_chflags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_chflags$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_chflags",
        constants$33.fuse_fs_chflags$FUNC
    );
    static final FunctionDescriptor fuse_fs_getxtimes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_getxtimes$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_getxtimes",
        constants$33.fuse_fs_getxtimes$FUNC
    );
    static final FunctionDescriptor fuse_fs_setbkuptime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_setbkuptime$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_setbkuptime",
        constants$33.fuse_fs_setbkuptime$FUNC
    );
    static final FunctionDescriptor fuse_fs_setchgtime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_setchgtime$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_setchgtime",
        constants$33.fuse_fs_setchgtime$FUNC
    );
}


