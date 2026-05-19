package com.oracle.truffle.lama.runtime;

import com.oracle.truffle.api.CallTarget;

/** Function body without captured frame; materialized on each fun-name read. */
public record LamaFunctionTemplate(CallTarget callTarget, int arity) {}
