package com.ssm.service;

import com.ssm.model.User;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface IUserService {

    /**
     * @description 根据用户id获取用户信息
     * @method
     * @param userId
     * @return
     * @date: 2017/11/13 11:03
     * @author:yangshaoping
     */
    public User getUserById(int userId);
    
    /**
     * @description 获取所有的用户
     * @method  
     * @return
     * @date: 2017/11/13 14:15
     * @author:yangshaoping
     */
    public List<User> getAllUser();
}
