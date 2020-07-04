/**
 * Copyright (C), 2015-2017
 * FileName: SampleController
 * Author:   YangShaoping
 * Date:     2017/8/18 10:26
 * Description: 测试代码
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.basic.controller;

import com.basic.entity.User;
import com.basic.service.impl.UserService;
import com.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试代码〉
 *
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * 页面跳转
     * @return:
     * @since: 1.0.0
     * @Author:Administrator
     * @Date: 2017/8/18 16:45
     */
    @RequestMapping(value="/{page}",method = {RequestMethod.GET,RequestMethod.POST})
    public String page(@PathVariable String page, HttpServletRequest request, Model model) {
        Map requestMap = request.getParameterMap();

        model.addAllAttributes(requestMap);

        if(page == null || "".equals(page)) {
            return "user/index";
        } else {
            return "user/" + page;
        }
    }

    /**
     * 注册
     * @return:
     * @since: 1.0.0
     * @Author:Administrator
     * @Date: 2017/8/18 17:00
     */
    @RequestMapping("/regist")
    @ResponseBody
    public Map<String, Object> regist(HttpServletResponse response,User user){
        try {
            return userService.regist(user);
        } catch (Exception e){
            e.printStackTrace();
            return Result.systemError(e);
        }
    }

    @RequestMapping("/userList")
    @ResponseBody
    public Map<String, Object> userList(){
        try {
            return userService.userList();
        } catch (Exception e){
            e.printStackTrace();
            return Result.systemError(e);
        }
    }

    @RequestMapping("/show")
    @ResponseBody
    public String show(@RequestParam(required = true) String name){
        User user = userService.findByName(name);
        if(user == null){
            return null;
        }
        return user.getId() + "," + user.getName() + "," + user.getPassword();
    }

    @RequestMapping("/testLog")
    @ResponseBody
    public void testLog(){

        logger.info(" test info ===============> ");
        logger.debug(" test debug =============>");
        logger.error(" test error =============>");
        logger.trace(" test trace =============>");
        logger.warn(" test warn ===============>");

    }


}