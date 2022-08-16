package com.wkcto.dubbo.service;

import com.wkcto.dubbo.model.User;

public interface UserService {

    /**
     * 根据用户标识获取用户信息
     * @return
     */
    User queryUserById(Integer id);


    /**
     * 查询用户总人数
     * @return
     */
    Integer queryUserCount();
}
