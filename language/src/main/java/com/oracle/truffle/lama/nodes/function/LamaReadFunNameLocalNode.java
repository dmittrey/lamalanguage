package com.oracle.truffle.lama.nodes.function;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.lama.exception.LamaTypeException;
import com.oracle.truffle.lama.nodes.expression.LamaExpressionNode;
import com.oracle.truffle.lama.runtime.LamaFrameSnapshot;
import com.oracle.truffle.lama.runtime.LamaFunctionTemplate;

public final class LamaReadFunNameLocalNode extends LamaExpressionNode {
    private final int slot;

    public LamaReadFunNameLocalNode(int slot) {
        this.slot = slot;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object val = frame.getObject(slot);
        if (!(val instanceof LamaFunctionTemplate template)) {
            throw new LamaTypeException("Expected function template in slot", val);
        }
        return LamaFrameSnapshot.materialize(template, frame);
    }
}
