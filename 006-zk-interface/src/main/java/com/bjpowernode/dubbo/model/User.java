package com.bjpowernode.dubbo.model;

import java.io.Serializable;

/**
 * @Author 临渊
 * @Date 2022-08-17 6:45
 */
public class User implements Serializable {

    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
