package com.oracle.truffle.lama;

import org.antlr.v4.runtime.CharStreams;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.lama.nodes.LamaRootNode;
import com.oracle.truffle.lama.parser.LamaCustomParser;
import com.oracle.truffle.lama.runtime.LamaContext;

@TruffleLanguage.Registration(
                id = LamaLanguage.ID,
                name = "Lama",
                defaultMimeType = LamaLanguage.MIME_TYPE,
                characterMimeTypes = LamaLanguage.MIME_TYPE,
                fileTypeDetectors = LamaFileDetector.class)
public final class LamaLanguage extends TruffleLanguage<LamaContext> {

    public static final String ID = "lama";
    public static final String MIME_TYPE = "application/x-lama";

    @Override
    protected LamaContext createContext(Env env) {
        return new LamaContext(env);
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        FrameDescriptor.Builder builder = FrameDescriptor.newBuilder();
        LamaCustomParser visitor = new LamaCustomParser(this, builder);
        LamaRootNode rootNode = visitor.parse(this, CharStreams.fromReader(request.getSource().getReader()));
        return rootNode.getCallTarget();
    }
}
