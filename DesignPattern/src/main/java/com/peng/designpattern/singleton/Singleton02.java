package com.peng.designpattern.singleton;

/**
 * 单例类，使用懒汉式的方式实现单例
 * 懒汉式有三种，第一种是线程不安全的,第二种是使用同步方法来达到线程安全,第三种是通过同步代码块的方式
 */
public class Singleton02 {
    private Singleton02() {}

    private static Singleton02 instance;

    //线程不安全
//    public static Singleton02 getInstance() {
//        if (instance == null) {
//            instance = new Singleton02();
//        }
//        return instance;
//    }

    //同步方法实现懒汉式，线程安全
//    public static synchronized Singleton02 getInstance() {
//        if (instance == null) {
//            instance = new Singleton02();
//        }
//        return instance;
//    }

    //同步代码块实现懒汉式
    public static Singleton02 getInstance() {
        if (instance == null) {
            synchronized (Singleton02.class) {
                instance = new Singleton02();
            }
        }
        return instance;
    }
}
