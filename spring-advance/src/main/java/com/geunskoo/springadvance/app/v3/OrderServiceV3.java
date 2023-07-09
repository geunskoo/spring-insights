package com.geunskoo.springadvance.app.v3;

import com.geunskoo.springadvance.trace.TraceId;
import com.geunskoo.springadvance.trace.TraceStatus;
import com.geunskoo.springadvance.trace.hellotrace.HelloTraceV2;
import com.geunskoo.springadvance.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV3 {

    private final OrderRepositoryV3 orderRepository;
    private final LogTrace trace;

    public void orderItem(String itemId) {

        TraceStatus status = null;
        try {
            status = trace.begin("OrderServiceV1.orderItem()");
            //비즈니스 로직
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }
    }
}
