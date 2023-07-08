package com.geunskoo.springadvance.trace.hellotrace;

import static org.junit.jupiter.api.Assertions.*;

import com.geunskoo.springadvance.trace.TraceStatus;
import org.junit.jupiter.api.Test;


class HelloTraceV1Test {

    /**
     * [!경고]
     * 해당 테스트는 자동 검증이 없습니다.
     * 로그기록기 작동 확인을 위한 학습테스트입니다.
     */
    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);
    }

    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());
    }
}