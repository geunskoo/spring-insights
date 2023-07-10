package com.geunskoo.springproxy;

import com.geunskoo.springproxy.app.config.AppV1Config;
import com.geunskoo.springproxy.app.config.AppV2Config;
import com.geunskoo.springproxy.app.config.v1_proxy.InterfaceProxyConfig;
import com.geunskoo.springproxy.trace.logtrace.LogTrace;
import com.geunskoo.springproxy.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
//@Import({AppV1Config.class, AppV2Config.class})
@Import(InterfaceProxyConfig.class)
@SpringBootApplication(scanBasePackages = "com.geunskoo.springproxy.app.interface_proxy")
public class SpringProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProxyApplication.class, args);
    }

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
