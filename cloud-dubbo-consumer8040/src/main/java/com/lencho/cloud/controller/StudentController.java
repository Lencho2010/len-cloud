package com.lencho.cloud.controller;

import com.lencho.cloud.service.StudentService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-08-26 21:51
 * @desc
 */
@RestController
@RequestMapping("/consumer")
public class StudentController {

    @Reference
    private StudentService studentService;

    @GetMapping("/stu/get")
    public String get() {
        return studentService.get();
    }
}
