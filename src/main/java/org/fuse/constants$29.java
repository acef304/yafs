// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$29 {

    static final FunctionDescriptor fuse_fs_fgetattr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_fgetattr$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_fgetattr",
        constants$29.fuse_fs_fgetattr$FUNC
    );
    static final FunctionDescriptor fuse_fs_rename$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_rename$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_rename",
        constants$29.fuse_fs_rename$FUNC
    );
    static final FunctionDescriptor fuse_fs_renamex$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_renamex$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_renamex",
        constants$29.fuse_fs_renamex$FUNC
    );
    static final FunctionDescriptor fuse_fs_setvolname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_setvolname$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_setvolname",
        constants$29.fuse_fs_setvolname$FUNC
    );
    static final FunctionDescriptor fuse_fs_exchange$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle fuse_fs_exchange$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_exchange",
        constants$29.fuse_fs_exchange$FUNC
    );
    static final FunctionDescriptor fuse_fs_unlink$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_unlink$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_unlink",
        constants$29.fuse_fs_unlink$FUNC
    );
}

