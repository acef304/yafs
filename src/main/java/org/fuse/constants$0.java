// Generated by jextract

package org.fuse;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor fuse_opt_proc_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_opt_proc_t$MH = RuntimeHelper.downcallHandle(
        constants$0.fuse_opt_proc_t$FUNC
    );
    static final FunctionDescriptor fuse_opt_parse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_opt_parse$MH = RuntimeHelper.downcallHandle(
        "fuse_opt_parse",
        constants$0.fuse_opt_parse$FUNC
    );
    static final FunctionDescriptor fuse_opt_add_opt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_opt_add_opt$MH = RuntimeHelper.downcallHandle(
        "fuse_opt_add_opt",
        constants$0.fuse_opt_add_opt$FUNC
    );
    static final FunctionDescriptor fuse_opt_add_opt_escaped$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_opt_add_opt_escaped$MH = RuntimeHelper.downcallHandle(
        "fuse_opt_add_opt_escaped",
        constants$0.fuse_opt_add_opt_escaped$FUNC
    );
    static final FunctionDescriptor fuse_opt_add_arg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fuse_opt_add_arg$MH = RuntimeHelper.downcallHandle(
        "fuse_opt_add_arg",
        constants$0.fuse_opt_add_arg$FUNC
    );
}


