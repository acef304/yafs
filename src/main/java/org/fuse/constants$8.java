// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$8 {

    static final FunctionDescriptor umaskx_np$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle umaskx_np$MH = RuntimeHelper.downcallHandle(
        "umaskx_np",
        constants$8.umaskx_np$FUNC
    );
    static final FunctionDescriptor fuse_mount$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_mount$MH = RuntimeHelper.downcallHandle(
        "fuse_mount",
        constants$8.fuse_mount$FUNC
    );
    static final FunctionDescriptor fuse_unmount$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_unmount$MH = RuntimeHelper.downcallHandle(
        "fuse_unmount",
        constants$8.fuse_unmount$FUNC
    );
    static final FunctionDescriptor fuse_parse_cmdline$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_parse_cmdline$MH = RuntimeHelper.downcallHandle(
        "fuse_parse_cmdline",
        constants$8.fuse_parse_cmdline$FUNC
    );
    static final FunctionDescriptor fuse_daemonize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fuse_daemonize$MH = RuntimeHelper.downcallHandle(
        "fuse_daemonize",
        constants$8.fuse_daemonize$FUNC
    );
    static final FunctionDescriptor fuse_version$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle fuse_version$MH = RuntimeHelper.downcallHandle(
        "fuse_version",
        constants$8.fuse_version$FUNC
    );
}


