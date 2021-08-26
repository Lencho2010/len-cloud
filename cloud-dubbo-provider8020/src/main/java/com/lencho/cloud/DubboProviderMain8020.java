package com.lencho.cloud;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

/**
 * @author Lencho
 * @create 2021-08-26 21:09
 * @desc
 */
@EnableDubbo
@SpringBootApplication(exclude = { FeignAutoConfiguration.class })
public class DubboProviderMain8020 {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderMain8020.class, args);
    }
}
