package com.peng.designpattern.singleton;

/**
 * 单例类，使用双重检查实现单例
 */
public class Singleton03 {
    private Singleton03() {}

    //加上volatile关键字防止指令重排序
    private static volatile Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}
