package com.miracle.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangshaoping
 * @create 2020-07-15 19:52
 */
@RequestMapping("/admin")
@Controller
public class AdminController {

    @RequestMapping("/home")
    @ResponseBody
    public String productInfo(){
        return " admin home page ";
    }

}