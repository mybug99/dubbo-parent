package com.dubbo.consumer.controller;

import com.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Reference(check = false)
    HelloService helloService;

    @RequestMapping("/hello/{msg}")
    @ResponseBody
    public String hello(@PathVariable String msg){
        return helloService.hello(msg);
    }
}
