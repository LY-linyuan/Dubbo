package com.wkcto.dubbo.service.impl;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;

/**
 * @Author 临渊
 * @Date 2022-08-16 17:44
 */
public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("张三");
        return user;
    }

    @Override
    public Integer queryUserCount() {
        return 52;
    }
}
