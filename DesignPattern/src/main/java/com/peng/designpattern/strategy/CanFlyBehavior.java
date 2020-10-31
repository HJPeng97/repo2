package com.peng.designpattern.strategy;

/**
 * 鸭子飞翔行为中的一种，可以飞
 */
public class CanFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("本鸭子可以飞....");
    }
}
