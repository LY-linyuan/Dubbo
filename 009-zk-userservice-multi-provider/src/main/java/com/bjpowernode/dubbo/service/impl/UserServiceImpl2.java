package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

/**
 * @Author 临渊
 * @Date 2022-08-17 9:49
 */
public class UserServiceImpl2 implements UserService {
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username + "222");
        return user;
    }
}
