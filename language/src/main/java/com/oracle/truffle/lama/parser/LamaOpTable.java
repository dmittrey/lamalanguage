package com.oracle.truffle.lama.parser;

import java.util.HashMap;
import java.util.Map;

public final class LamaOpTable {
    public record OpInfo(int prec, boolean rightAssoc, String funName) {}

    private final LamaOpTable parent;
    private final Map<String, OpInfo> ops = new HashMap<>();

    private LamaOpTable(LamaOpTable parent) {
        this.parent = parent;
    }

    public static LamaOpTable builtin() {
        LamaOpTable t = new LamaOpTable(null);
        t.ops.put(":", new OpInfo(10, true, null));
        t.ops.put("!!", new OpInfo(20, false, null));
        t.ops.put("&&", new OpInfo(30, false, null));
        t.ops.put("==", new OpInfo(40, false, null));
        t.ops.put("!=", new OpInfo(40, false, null));
        t.ops.put("<", new OpInfo(50, false, null));
        t.ops.put("<=", new OpInfo(50, false, null));
        t.ops.put(">", new OpInfo(50, false, null));
        t.ops.put(">=", new OpInfo(50, false, null));
        t.ops.put("+", new OpInfo(60, false, null));
        t.ops.put("-", new OpInfo(60, false, null));
        t.ops.put("*", new OpInfo(70, false, null));
        t.ops.put("/", new OpInfo(70, false, null));
        t.ops.put("%", new OpInfo(70, false, null));
        return t;
    }

    public LamaOpTable child() {
        return new LamaOpTable(this);
    }

    public void define(String op, OpInfo info) {
        ops.put(op, info);
    }

    public OpInfo lookup(String op) {
        OpInfo info = ops.get(op);
        if (info != null) {
            return info;
        }
        return parent != null ? parent.lookup(op) : null;
    }
}
