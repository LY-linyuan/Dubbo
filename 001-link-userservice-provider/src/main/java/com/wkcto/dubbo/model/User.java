package com.wkcto.dubbo.model;

import java.io.Serializable;

/**
 * @Author 临渊
 * @Date 2022-08-15 22:01
 */
public class User implements Serializable {

    private Integer id;
    private String username;
    private Integer age;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
