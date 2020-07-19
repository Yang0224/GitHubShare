package com.miracle.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangshaoping
 * @create 2020-07-15 19:06
 */
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("hello")
    public Object hello(){
        return "Hello! Spring Secruity";
    }

}