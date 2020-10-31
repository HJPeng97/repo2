package com.peng.designpattern.decorator;

/**
 * 牛奶类
 * 体的装饰者类，这里是具体的调味品
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶");
        setPrice(2.0f);
    }
}
