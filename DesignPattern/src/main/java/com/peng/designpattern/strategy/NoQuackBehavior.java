package com.peng.designpattern.strategy;

/**
 * 鸭子叫的行为中的一种，不会叫
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("本鸭子不会叫....");
    }
}
