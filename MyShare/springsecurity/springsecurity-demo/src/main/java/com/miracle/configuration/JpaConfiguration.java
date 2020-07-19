package com.miracle.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * JPA配置信息
 *
 * @author yangshaoping
 * @create 2020-07-15 20:59
 */
//@Configuration      //@Configuration注解该类，等价 与XML中配置beans；用@Bean标注方法等价于XML中配置bean。
//@EnableTransactionManagement(proxyTargetClass = true)   //开启注解式事务的支持    通知Spring，@Transactional注解的类被事务的切面包围。这样@Transactional就可以使用了
//@EnableJpaRepositories(basePackages = "com.miracle.repository")     //注解开启对Spring Data JPA Repostory的支持
//@EntityScan(basePackages = "com.miracle.entity")    //对实体类的扫描
public class JpaConfiguration {

}