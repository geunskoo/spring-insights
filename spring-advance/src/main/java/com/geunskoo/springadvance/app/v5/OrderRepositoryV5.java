package com.geunskoo.springadvance.app.v5;

import com.geunskoo.springadvance.trace.callback.TraceTemplate;
import com.geunskoo.springadvance.trace.logtrace.LogTrace;
import com.geunskoo.springadvance.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryV5 {

    private final TraceTemplate template;

    public OrderRepositoryV5(LogTrace trace) {
        this.template = new TraceTemplate(trace);
    }

    public void save(String itemId) {

        template.execute("OrderRepositoryV4.save()", () -> {
                //저장로직
                if (itemId.equals("ex")) {
                    throw new IllegalStateException("예외 발생!");
                }
                sleep(1000);

                return null;
            }
        );
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
