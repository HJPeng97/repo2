package com.peng.designpattern.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest test = new CloneTest("hello");
        Sheep sheep = new Sheep("tom", 1, "白色",test);
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        Sheep sheep6 = (Sheep) sheep.clone();
        sheep4.test.setName("hi");
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
        System.out.println(sheep == sheep1); // false (对象的浅拷贝，是针对于对象的成员变量来说的)

        System.out.println("=========重写clone实现深拷贝=========");
        DeepCloneTest deepCloneTest = new DeepCloneTest("hello",test);
        DeepCloneTest deepCloneTest1 = (DeepCloneTest) deepCloneTest.clone();
        DeepCloneTest deepCloneTest2 = (DeepCloneTest) deepCloneTest.clone();
        deepCloneTest2.getCloneTest().setName("nihao");
        System.out.println(deepCloneTest1);
        System.out.println(deepCloneTest2);
        System.out.println("=========反序列化实现深拷贝=========");
        DeepCloneTest deepCloneTest3 = (DeepCloneTest) deepCloneTest.deepClone();
        DeepCloneTest deepCloneTest4 = (DeepCloneTest) deepCloneTest.deepClone();
        deepCloneTest4.getCloneTest().setName("nihao");
        System.out.println(deepCloneTest3);
        System.out.println(deepCloneTest4);
    }
}
