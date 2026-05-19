package com.oracle.truffle.lama.nodes;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.lama.LamaLanguage;
import com.oracle.truffle.lama.nodes.expression.LamaExpressionNode;

public final class LamaRootNode extends RootNode {
    @Node.Child
    private LamaExpressionNode bodyNode;

    public LamaRootNode(LamaLanguage language, FrameDescriptor frameDescriptor, LamaExpressionNode bodyNode) {
        super(language, frameDescriptor);
        this.bodyNode = bodyNode;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return bodyNode.executeGeneric(frame);
    }
}
