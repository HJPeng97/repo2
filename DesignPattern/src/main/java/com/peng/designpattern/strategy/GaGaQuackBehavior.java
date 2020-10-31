package com.peng.designpattern.strategy;

/**
 * 鸭子叫的行为中的一种，嘎嘎叫
 */
public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("本鸭子嘎嘎叫....");
    }
}
