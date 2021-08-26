package com.lencho.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-08-26 20:14
 * @desc
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String get() {
        return "Hello SpringBoot!!!" + serverPort;
    }
}
