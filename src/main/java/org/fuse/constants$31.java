// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$31 {

    static final FunctionDescriptor fuse_fs_read_buf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_read_buf$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_read_buf",
        constants$31.fuse_fs_read_buf$FUNC
    );
    static final FunctionDescriptor fuse_fs_write$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_write$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_write",
        constants$31.fuse_fs_write$FUNC
    );
    static final FunctionDescriptor fuse_fs_write_buf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_write_buf$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_write_buf",
        constants$31.fuse_fs_write_buf$FUNC
    );
    static final FunctionDescriptor fuse_fs_fsync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_fsync$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_fsync",
        constants$31.fuse_fs_fsync$FUNC
    );
    static final FunctionDescriptor fuse_fs_flush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_flush$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_flush",
        constants$31.fuse_fs_flush$FUNC
    );
    static final FunctionDescriptor fuse_fs_statfs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_fs_statfs$MH = RuntimeHelper.downcallHandle(
        "fuse_fs_statfs",
        constants$31.fuse_fs_statfs$FUNC
    );
}


