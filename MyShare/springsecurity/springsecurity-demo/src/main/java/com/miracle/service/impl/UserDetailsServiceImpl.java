package com.miracle.service.impl;

import com.miracle.entity.User;
import com.miracle.repository.UserReposityry;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yangshaoping
 * @create 2020-07-15 20:28
 */
@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{

    @Resource
    private UserReposityry userReposityry;

    /**
     * 这个方法做2件事情，查询用户以及设置角色，
     * 通常一个用户会有多个角色，即上面的userFromDatabase.getRole()通常是一个list，
     * 所以设置角色的时候，就是for循环new 多个SimpleGrantedAuthority并设置。
     * （本例为了简单没有设置角色表以及用户角色关联表，只在用户中增加了一个角色字段，所以grantedAuthorities只有一个）
     * @param login
     * @return
     */
    @Override
    public UserDetails loadUserByUsername(String login) {
        //根据login查询
        User userFromDatabase = userReposityry.findByLogin(login);
        if(userFromDatabase == null){
            //找不到抛出异常
            throw new UsernameNotFoundException("User " + login + " was not found in db");
        }
        //设置角色
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userFromDatabase.getRole());
        grantedAuthorities.add(grantedAuthority);

        return new org.springframework.security.core.userdetails.User(login, userFromDatabase.getPassword(), grantedAuthorities);
    }
}