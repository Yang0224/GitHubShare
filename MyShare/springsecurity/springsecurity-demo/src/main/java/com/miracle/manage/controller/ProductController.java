package com.miracle.manage.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangshaoping
 * @create 2020-07-15 19:51
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/info")
    @ResponseBody
    public String productInfo(){
        String currentUser;
        Object principl = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principl instanceof UserDetails) {
            currentUser = ((UserDetails)principl).getUsername();
        }else {
            currentUser = principl.toString();
        }
        return " some product info,currentUser is: " + currentUser;
    }

}