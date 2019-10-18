package com.dubbo.provider.service;

import com.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String msg) {
        return "hello   " + msg;
    }
}
