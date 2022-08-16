package com.wkcto.dubbo.model;

import java.io.Serializable;

/**
 * @Author 临渊
 * @Date 2022-08-16 17:25
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
