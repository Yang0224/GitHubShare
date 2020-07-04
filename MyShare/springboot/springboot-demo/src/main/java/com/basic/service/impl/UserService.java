/**
 * Copyright (C), 2015-2017
 * FileName: UserServiceImpl
 * Author:   YangShaoping
 * Date:     2017/8/18 13:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.basic.service.impl;

import com.basic.repositoty.UserRepositoty;
import com.basic.entity.User;
import com.basic.service.IUserService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
@Service
@Transactional
public class UserService implements IUserService{

    @Autowired
    private UserRepositoty userRepositoty;

    @Override
    public User findByName(String name) {
        User user = userRepositoty.findByName(name);
        return user;
    }

    @Override
    public Map<String, Object> regist(User user) throws Exception{
        //检查name是否重复
        User check = userRepositoty.findByName(user.getName());
        if(check != null){
            return Result.error("用户名已存在");
        }
        userRepositoty.save(user);
        return Result.success("注册成功");
    }

    @Override
    public Map<String, Object> userList() throws Exception {
        List<Map<String, Object>> users = userRepositoty.findAll();
        return Result.success("获取成功", "users", users);
    }

}