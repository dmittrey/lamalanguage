package com.oracle.truffle.lama.runtime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.TruffleLanguage.ContextReference;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.dsl.Bind;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.lama.LamaLanguage;

@Bind.DefaultExpression("get($node)")
public final class LamaContext {
    @CompilationFinal private Env env;
    private final BufferedReader input;
    private final PrintWriter output;

    public CallTarget parse(Source source) {
        return env.parsePublic(source);
    }
    private static final ContextReference<LamaContext> REFERENCE = ContextReference.create(LamaLanguage.class);
    @CompilerDirectives.TruffleBoundary
    public static LamaContext get(Node node) {
        return REFERENCE.get(node);
    }

    public LamaContext(Env env) {
        this.env = env;
        this.input = new BufferedReader(new InputStreamReader(env.in()));
        this.output = new PrintWriter(env.out(), true);
    }
    public BufferedReader getInput() {
        return input;
    }
    public PrintWriter getOutput() {
        return output;
    }

    private final Map<String, Object> globals = new HashMap<>();
    @CompilerDirectives.TruffleBoundary
    public Object getGlobal(String name) {
        return globals.get(name);
    }
    public void setGlobal(String name, Object value) {
        globals.put(name, value);
    }
}
