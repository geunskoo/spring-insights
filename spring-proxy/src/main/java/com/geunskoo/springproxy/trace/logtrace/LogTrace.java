package com.geunskoo.springproxy.trace.logtrace;

import com.geunskoo.springproxy.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
