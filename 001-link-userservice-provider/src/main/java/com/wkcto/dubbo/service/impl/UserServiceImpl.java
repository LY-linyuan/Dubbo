package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

/**
 * @Author 临渊
 * @Date 2022-08-15 22:05
 */
public class UserServiceImpl implements UserService {


    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("张三");
        user.setAge(23);
        return user;
    }
}
