package com.peng.designpattern.strategy;

/**
 * 鸭子飞翔行为中的一种，不会飞
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("本鸭子不会飞....");
    }
}
