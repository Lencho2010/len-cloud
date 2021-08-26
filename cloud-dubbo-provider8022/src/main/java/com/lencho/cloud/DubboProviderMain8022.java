package com.lencho.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

/**
 * @author Lencho
 * @create 2021-08-26 22:02
 * @desc
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = { FeignAutoConfiguration.class })
public class DubboProviderMain8022 {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderMain8022.class, args);
    }
}
