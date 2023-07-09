package com.geunskoo.springadvance.trace.logtrace;

import com.geunskoo.springadvance.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}