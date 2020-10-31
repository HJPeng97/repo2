package com.peng.designpattern.strategy;

/**
 * 飞翔行为的接口，使用了策略模式，将一个行为（策略）抽取出来，具体的实现由其子类去实现
 *  鸭子的飞翔行为有两种，一种是可以飞翔，另一种是不可以飞翔，因此该接口有两个具体的实现类
 */
public interface FlyBehavior {
    void fly();
}
