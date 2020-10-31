package com.peng.designpattern.singleton;

/**
 * 使用枚举实现单例
 */
public enum Singleton05 {
    INSTANCE; // 属性
    public void hello() {
        System.out.println("hello!!!");
    }
}
