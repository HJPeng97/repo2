package com.peng.designpattern.singleton;

/**
 * 单例类，使用静态内部类的方式实现单例
 */
public class Singleton04 {
    private Singleton04() {}

    private static class SingletonInstance {
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
