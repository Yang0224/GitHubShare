package com.cloud.ribbon.consumer.ribbonconsumer.service;

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
    RestTemplate restTemplate;  //注入resttemplate

    public String sayHello(){
        return restTemplate.getForObject("http://ribbon-provider/hello?name=yang", String.class);
    }

}