package com.cqsudu.lightning.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring cloud gateway
 *
 * @author konghang
 */
@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class SpringCloudGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudGatewayApplication.class).run(args);
    }
}
