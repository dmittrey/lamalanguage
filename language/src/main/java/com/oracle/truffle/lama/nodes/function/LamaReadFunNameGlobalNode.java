package com.oracle.truffle.lama.nodes.function;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.lama.exception.LamaTypeException;
import com.oracle.truffle.lama.nodes.expression.LamaExpressionNode;
import com.oracle.truffle.lama.runtime.LamaContext;
import com.oracle.truffle.lama.runtime.LamaFrameSnapshot;
import com.oracle.truffle.lama.runtime.LamaFunctionTemplate;

public final class LamaReadFunNameGlobalNode extends LamaExpressionNode {
    private final String name;

    public LamaReadFunNameGlobalNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object val = LamaContext.get(this).getGlobal(name);
        if (!(val instanceof LamaFunctionTemplate template)) {
            throw new LamaTypeException("Expected function template in global", val);
        }
        return LamaFrameSnapshot.materialize(template, frame);
    }
}
