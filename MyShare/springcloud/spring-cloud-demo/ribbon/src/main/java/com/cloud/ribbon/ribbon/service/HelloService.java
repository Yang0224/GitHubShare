package com.cloud.ribbon.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @author yangshaoping
 * @create 2020-07-19 19:25
 */
@Service
public class HelloService {

    public String sayHello(){
        return "hello world";
    }

}