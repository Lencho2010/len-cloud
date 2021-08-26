package com.lencho.cloud.controller;

import com.lencho.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-08-26 20:33
 * @desc
 */
@RestController
@RequestMapping("/consumer")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/hello/get")
    public String get() {
        return paymentFeignService.get();
    }
}
