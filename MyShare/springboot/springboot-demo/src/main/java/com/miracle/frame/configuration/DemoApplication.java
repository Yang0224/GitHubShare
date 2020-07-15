/**
 * Copyright (C), 2015-2017
 * FileName: Entry
 * Author:   YangShaoping
 * Date:     2017/8/18 16:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.miracle.frame.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动入口，配置包根路径
 *
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.miracle")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}