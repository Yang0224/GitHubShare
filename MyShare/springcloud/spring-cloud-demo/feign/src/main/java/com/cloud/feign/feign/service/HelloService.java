package com.cloud.feign.feign.service;

import com.cloud.feign.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangshaoping
 * @create 2020-07-19 19:25
 */
@Service
public class HelloService {

    @Autowired
    GetHello getHello;  //注入rpc

    public String sayHello(){
        return getHello.sayHello();
    }

}