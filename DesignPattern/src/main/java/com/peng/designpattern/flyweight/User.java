package com.peng.designpattern.flyweight;

/**
 * 用户类，每个网站都有一个使用的用户
 * 享元模式的外部状态
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
