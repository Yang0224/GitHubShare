/**
 * Copyright (C), 2015-2017
 * FileName: IUserService
 * Author:   YangShaoping
 * Date:     2017/8/18 15:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.basic.service;

import com.basic.entity.User;

import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
public interface IUserService {

    /**
     * 根据名字查询用户
     * @param name
     * @return
     */
    User findByName(String name);

    /**
     * 注册
     * @return:
     * @since: 1.0.0
     * @Author:Administrator
     * @Date: 2017/8/18 17:02
     */
    Map<String, Object> regist(User user) throws Exception;

    /**
     * 用户列表
     * @return:
     * @since: 1.0.0
     * @Author:Administrator
     * @Date: 2017/8/18 18:19
     */
    Map<String, Object> userList() throws Exception;

}