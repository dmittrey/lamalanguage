package com.oracle.truffle.lama.runtime;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LamaScopeEnvironment {
    public final LamaScopeEnvironment parent;
    public final boolean isFunctionBoundary;
    public final Map<String, Integer> locals = new HashMap<>();
    public final Set<String> funDefNames = new HashSet<>();

    public LamaScopeEnvironment(LamaScopeEnvironment parent, boolean isFunctionBoundary) {
        this.parent = parent;
        this.isFunctionBoundary = isFunctionBoundary;
    }

    public void markFunDef(String name) {
        funDefNames.add(name);
    }

    public record Binding(int depth, int slot, boolean funDef) {}

    public Binding resolveBinding(String name) {
        LamaScopeEnvironment curr = this;
        int depth = 0;
        while (curr != null) {
            if (curr.locals.containsKey(name)) {
                boolean fun = curr.funDefNames.contains(name);
                return new Binding(depth, curr.locals.get(name), fun);
            }
            if (curr.isFunctionBoundary) {
                depth++;
            }
            curr = curr.parent;
        }
        return null;
    }

    /** @deprecated use {@link #resolveBinding} */
    public int[] resolve(String name) {
        Binding b = resolveBinding(name);
        return b == null ? null : new int[]{b.depth(), b.slot()};
    }
}
