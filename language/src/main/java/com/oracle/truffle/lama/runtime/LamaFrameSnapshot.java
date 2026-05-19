package com.oracle.truffle.lama.runtime;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.frame.VirtualFrame;

public final class LamaFrameSnapshot {
    private LamaFrameSnapshot() {}

    public static MaterializedFrame snapshot(VirtualFrame frame) {
        FrameDescriptor desc = frame.getFrameDescriptor();
        MaterializedFrame snap = Truffle.getRuntime().createMaterializedFrame(frame.getArguments(), desc);
        int n = desc.getNumberOfSlots();
        for (int i = 0; i < n; i++) {
            Object v = frame.getObject(i);
            if (v != null) {
                snap.setObject(i, v);
            }
        }
        return snap;
    }

    public static MaterializedFrame snapshotFrom(MaterializedFrame source) {
        FrameDescriptor desc = source.getFrameDescriptor();
        MaterializedFrame snap = Truffle.getRuntime().createMaterializedFrame(source.getArguments(), desc);
        int n = desc.getNumberOfSlots();
        for (int i = 0; i < n; i++) {
            Object v = source.getObject(i);
            if (v != null) {
                snap.setObject(i, v);
            }
        }
        return snap;
    }

    public static LamaFunctionObject materialize(LamaFunctionTemplate template, VirtualFrame frame) {
        return new LamaFunctionObject(template.callTarget(), template.arity(), snapshot(frame));
    }

    public static LamaFunctionObject materialize(LamaFunctionTemplate template, MaterializedFrame frame) {
        return new LamaFunctionObject(template.callTarget(), template.arity(), snapshotFrom(frame));
    }
}
