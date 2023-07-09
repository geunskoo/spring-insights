package com.geunskoo.springproxy.trace.callback;

public interface TraceCallback<T> {
    T call();
}
