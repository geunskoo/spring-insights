package com.geunskoo.springproxy;

import com.geunskoo.springproxy.app.config.AppV1Config;
import com.geunskoo.springproxy.app.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
@Import({AppV1Config.class, AppV2Config.class})
@SpringBootApplication(scanBasePackages = "com.geunskoo.springproxy.app")
public class SpringProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProxyApplication.class, args);
    }

}
