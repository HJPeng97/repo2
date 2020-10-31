package com.peng.designpattern.strategy;

/**
 * 鸭子叫的行为中的一种，咯咯叫
 */
public class GeGeQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("本鸭子咯咯叫....");
    }
}
