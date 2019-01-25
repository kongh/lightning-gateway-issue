package com.cqsudu.lightning.cloud.register;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 *
 * @author konghang
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaRegisterApplication.class).run(args);
    }
}
