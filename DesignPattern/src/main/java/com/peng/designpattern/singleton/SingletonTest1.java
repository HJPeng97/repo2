package com.peng.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 单例测试类，测试各种单例的使用
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance1.hashCode());

        System.out.println("枚举实现单例");
        Singleton05 instance2 = Singleton05.INSTANCE;
        Singleton05 instance3 = Singleton05.INSTANCE;
        System.out.println(instance2 == instance3);
        System.out.println("instance2.hashCode=" + instance2.hashCode());
        System.out.println("instance3.hashCode=" + instance3.hashCode());
        instance2.hello();
        instance3.hello();

        System.out.println("测试通过反射创建单例类");
        try {
            Class<?> aClass = Class.forName("com.peng.designpattern.singleton.Singleton01");
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton01 instance4 = (Singleton01) constructor.newInstance();
            System.out.println(instance == instance4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
