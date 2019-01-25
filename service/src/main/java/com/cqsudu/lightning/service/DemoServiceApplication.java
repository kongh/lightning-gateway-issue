package com.cqsudu.lightning.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCaching
public class DemoServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoServiceApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
