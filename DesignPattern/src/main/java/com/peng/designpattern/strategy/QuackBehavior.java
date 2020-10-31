package com.peng.designpattern.strategy;

/**
 * 鸭子叫的行为，使用了策略模式
 * 鸭子叫的行为（策略）有三种，分别为咯咯叫，嘎嘎叫和不会叫
 */
public interface QuackBehavior {
    void quack();
}
