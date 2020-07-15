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
package com.miracle.manage.service.impl;

import com.miracle.frame.orm.dao.IUserDao;
import com.miracle.frame.orm.entity.User;
import com.miracle.manage.service.IUserService;
import com.utils.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
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

    @Resource
    private IUserDao IUserDao;

    @Override
    public User findByName(String name) {
        User user = IUserDao.findByName(name);
        return user;
    }

    @Override
    public Map<String, Object> regist(String name, String password) throws Exception{
        //检查name是否重复
        User user = IUserDao.findByName(name);
        if(user != null){
            return Result.error("用户名已存在");
        }
        user = new User();
        user.setAge(18);
        user.setName(name);
        user.setPassword(password);
        user.setLoginTime(new Date());
        user.setRegistTime(new Date());
        user.setPassword(password);
        IUserDao.save(user);

        return Result.success("注册成功");
    }

    @Override
    public Map<String, Object> userList() throws Exception {
        List<User> users = IUserDao.findAll();
        return Result.success("获取成功", "users", users);
    }

}