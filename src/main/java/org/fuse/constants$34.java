// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$34 {

    static final FunctionDescriptor fuse_fs_setcrtime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_setcrtime$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_setcrtime",
        constants$34.fuse_fs_setcrtime$FUNC
    );
    static final FunctionDescriptor fuse_fs_chmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle fuse_fs_chmod$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_chmod",
        constants$34.fuse_fs_chmod$FUNC
    );
    static final FunctionDescriptor fuse_fs_chown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_fs_chown$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_chown",
        constants$34.fuse_fs_chown$FUNC
    );
    static final FunctionDescriptor fuse_fs_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle fuse_fs_truncate$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_truncate",
        constants$34.fuse_fs_truncate$FUNC
    );
    static final FunctionDescriptor fuse_fs_ftruncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_ftruncate$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_ftruncate",
        constants$34.fuse_fs_ftruncate$FUNC
    );
    static final FunctionDescriptor fuse_fs_utimens$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_utimens$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_utimens",
        constants$34.fuse_fs_utimens$FUNC
    );
}


