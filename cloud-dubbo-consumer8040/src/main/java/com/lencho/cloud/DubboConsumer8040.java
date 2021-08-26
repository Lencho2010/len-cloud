package com.lencho.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

/**
 * @author Lencho
 * @create 2021-08-26 21:49
 * @desc
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = { FeignAutoConfiguration.class })
public class DubboConsumer8040 {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer8040.class, args);
    }
}
