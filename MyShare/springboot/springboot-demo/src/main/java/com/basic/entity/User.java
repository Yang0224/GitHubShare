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
package com.basic.entity;

import javax.persistence.*;

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
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private String password;

    @Column(name = "parent_id")
    private String parentId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}