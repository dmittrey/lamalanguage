package com.oracle.truffle.lama.nodes.literal;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.lama.nodes.expression.LamaExpressionNode;
import com.oracle.truffle.lama.runtime.LamaFrameSnapshot;
import com.oracle.truffle.lama.runtime.LamaFunctionTemplate;

public final class LamaFunctionLiteralNode extends LamaExpressionNode {
    private final CallTarget target;
    private final int arity;

    public LamaFunctionLiteralNode(CallTarget target, int arity) {
        this.target = target;
        this.arity = arity;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return LamaFrameSnapshot.materialize(new LamaFunctionTemplate(target, arity), frame);
    }
}
