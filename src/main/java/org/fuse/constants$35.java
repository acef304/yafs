// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$35 {

    static final FunctionDescriptor fuse_fs_access$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_access$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_access",
        constants$35.fuse_fs_access$FUNC
    );
    static final FunctionDescriptor fuse_fs_readlink$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle fuse_fs_readlink$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_readlink",
        constants$35.fuse_fs_readlink$FUNC
    );
    static final FunctionDescriptor fuse_fs_mknod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_mknod$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_mknod",
        constants$35.fuse_fs_mknod$FUNC
    );
    static final FunctionDescriptor fuse_fs_mkdir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle fuse_fs_mkdir$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_mkdir",
        constants$35.fuse_fs_mkdir$FUNC
    );
    static final FunctionDescriptor fuse_fs_setxattr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_setxattr$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_setxattr",
        constants$35.fuse_fs_setxattr$FUNC
    );
    static final FunctionDescriptor fuse_fs_getxattr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_getxattr$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_getxattr",
        constants$35.fuse_fs_getxattr$FUNC
    );
}


