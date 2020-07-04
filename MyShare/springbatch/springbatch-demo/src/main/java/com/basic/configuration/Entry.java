package com.basic.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 运行批处理的主类
 *
 * @author yangshaoping
 * @create 2017/8/24 16:03
 * @DESCRIPTION:
 * @since 1.0.0
 */
@SpringBootApplication
public class Entry {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(Entry.class, args)));
    }

}