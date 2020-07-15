/**
 * Copyright (C), 2015-2017
 * FileName: User
 * Author:   YangShaoping
 * Date:     2017/8/18 11:12
 * Description: 用户实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.miracle.frame.orm.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户实体〉
 *
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private Integer age;

    @Column(name = "regist_time")
    private Date registTime;

    @Column(name = "login_time")
    private Date loginTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}