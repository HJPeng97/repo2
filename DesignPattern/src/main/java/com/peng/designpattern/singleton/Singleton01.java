package com.peng.designpattern.singleton;

/**
 * 使用饿汉式的方式实现单例
 * 饿汉式实现单例有两种方式，第一种是以静态常量的方式实现单例，第二种是以静态代码块的方式实现单例
 */
public class Singleton01 {
    private Singleton01() {
        //避免通过反射破坏单例
        if (instance != null) {
            throw new RuntimeException("此类是单例类，已存在该实例，不能创建!");
        }
    }

    //使用静态常量的方式
//    private static final Singleton01 instance = new Singleton01();

    //使用静态代码块的方式
    private static Singleton01 instance;

    static {
        instance = new Singleton01();
    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
