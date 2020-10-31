package com.peng.designpattern.factory.abstractFactory;

/**
 * 抽象工厂模式的抽象层，抽象工厂接口
 */
public interface AbsFactory {
    //生产披萨
    Pizza createPizza(String orderType);
}
