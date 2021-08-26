package com.lencho.cloud.service.impl;

import com.lencho.cloud.service.StudentService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Lencho
 * @create 2021-08-26 21:13
 * @desc
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String get() {
        return "hello from dubboProvider8020";
    }
}
