package com.chenjin.rpc.demo;


import java.io.Serializable;

/**
 * user对象
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;

    public User() {
    }

    public User(String username, Integer age) {
        this.name = username;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User String is:" + name + ",age:" + age;
    }
}