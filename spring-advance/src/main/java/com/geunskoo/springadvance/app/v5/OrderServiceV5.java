package com.geunskoo.springadvance.app.v5;

import com.geunskoo.springadvance.trace.callback.TraceCallBack;
import com.geunskoo.springadvance.trace.callback.TraceTemplate;
import com.geunskoo.springadvance.trace.logtrace.LogTrace;
import com.geunskoo.springadvance.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV5 {

    private final OrderRepositoryV5 orderRepository;
    private final TraceTemplate template;

    public OrderServiceV5(OrderRepositoryV5 orderRepository, LogTrace logTrace) {
        this.orderRepository = orderRepository;
        this.template = new TraceTemplate(logTrace);
    }

    public void orderItem(String itemId) {

        template.execute("OrderServiceV4.orderItem()", () -> {
            orderRepository.save(itemId);
             return null;
        });
    }
}
