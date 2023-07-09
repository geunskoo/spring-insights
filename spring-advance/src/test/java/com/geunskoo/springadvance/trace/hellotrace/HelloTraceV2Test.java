package com.geunskoo.springadvance.trace.hellotrace;

import com.geunskoo.springadvance.trace.TraceStatus;
import org.junit.jupiter.api.Test;


class HelloTraceV2Test {

    /**
     * [!경고] 해당 테스트는 자동 검증이 없습니다.
     * 로그기록기 작동 확인을 위한 학습테스트입니다.
     */
    @Test
    void begin_end() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception() {
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }
}