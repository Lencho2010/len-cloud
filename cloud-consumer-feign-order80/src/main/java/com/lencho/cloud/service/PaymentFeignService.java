package com.lencho.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lencho
 * @create 2021-08-26 20:31
 * @desc
 */
@Component
@FeignClient("cloud-provider-payment")
public interface PaymentFeignService {

    @GetMapping("/hello/get")
    String get();
}
