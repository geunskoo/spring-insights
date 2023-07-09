package com.geunskoo.springadvance.app.v5;

import com.geunskoo.springadvance.trace.callback.TraceCallBack;
import com.geunskoo.springadvance.trace.callback.TraceTemplate;
import com.geunskoo.springadvance.trace.logtrace.LogTrace;
import com.geunskoo.springadvance.trace.template.AbstractTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControllerV5 {

    private final OrderServiceV5 orderService;
    private final TraceTemplate template;

    public OrderControllerV5(OrderServiceV5 orderService, LogTrace trace) {
        this.orderService = orderService;
        this.template = new TraceTemplate(trace);
    }

    @GetMapping("/v5/request")
    public String request(String itemId) {

        return template.execute("OrderControllerV4.request()", () -> {
            orderService.orderItem(itemId);
            return "ok";
        });
    }
}
