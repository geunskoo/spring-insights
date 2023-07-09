package com.geunskoo.springadvance;

import com.geunskoo.springadvance.trace.logtrace.FieldLogTrace;
import com.geunskoo.springadvance.trace.logtrace.LogTrace;
import com.geunskoo.springadvance.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
