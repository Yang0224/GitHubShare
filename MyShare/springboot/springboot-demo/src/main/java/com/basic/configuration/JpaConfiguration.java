/**
 * Copyright (C), 2015-2017
 * FileName: JpaConfiguration
 * Author:   YangShaoping
 * Date:     2017/8/18 15:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.basic.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *  JPA配置类
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE)  //使用注解方式控制bean的加载顺序  值越小，越先被加载
@Configuration      //@Configuration注解该类，等价 与XML中配置beans；用@Bean标注方法等价于XML中配置bean。
@EnableTransactionManagement(proxyTargetClass = true)    //开启注解式事务的支持    通知Spring，@Transactional注解的类被事务的切面包围。这样@Transactional就可以使用了
@EnableJpaRepositories(basePackages = "com.basic.repositoty")   //注解开启对Spring Data JPA Repostory的支持
@EntityScan(basePackages = "com.basic.entity")      //对实体类的扫描
public class JpaConfiguration extends WebMvcConfigurerAdapter{

    @Bean
    PersistenceExceptionTranslationPostProcessor petpp(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

    /**
     * 注册/配置拦截器
     * @return:
     * @since: 1.0.0
     * @Author:Administrator
     * @Date: 2017/8/22 17:40
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");  //对所有请求进行拦截
    }

}