package com.lencho.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

/**
 * @author Lencho
 * @create 2021-08-26 23:24
 * @desc
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {FeignAutoConfiguration.class})
public class DubboConsumer8050 {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer8050.class, args);
    }
}
