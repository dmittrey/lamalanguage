package com.oracle.truffle.lama.nodes.function;

import com.oracle.truffle.api.frame.MaterializedFrame;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.lama.exception.LamaTypeException;
import com.oracle.truffle.lama.nodes.expression.LamaExpressionNode;
import com.oracle.truffle.lama.runtime.LamaFrameSnapshot;
import com.oracle.truffle.lama.runtime.LamaFunctionTemplate;

public final class LamaReadFunNameClosureNode extends LamaExpressionNode {
    private final int depth;
    private final int slot;

    public LamaReadFunNameClosureNode(int depth, int slot) {
        this.depth = depth;
        this.slot = slot;
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        MaterializedFrame current = (MaterializedFrame) frame.getArguments()[0];
        for (int i = 1; i < depth; i++) {
            current = (MaterializedFrame) current.getArguments()[0];
        }
        Object val = current.getObject(slot);
        if (!(val instanceof LamaFunctionTemplate template)) {
            throw new LamaTypeException("Expected function template in closure slot", val);
        }
        return LamaFrameSnapshot.materialize(template, current);
    }
}
