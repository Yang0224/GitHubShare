package com.cloud.ribbon.consumer.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@ComponentScan //冗余声明，@SpringBootApplication中已经包含该注解
@SpringBootApplication
@EnableDiscoveryClient  //注册服务
public class RibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced   //表示开启负载均衡
    @Autowired
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
