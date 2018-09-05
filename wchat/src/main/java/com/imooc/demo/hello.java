package com.imooc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yrui on 2018/9/3.
 */
@RestController
public class hello {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot!";
    }
}
