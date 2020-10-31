package com.peng.designpattern.decorator;

/**
 * 巧克力类
 * 具体的装饰者类，这里是具体的调味品
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力");
        setPrice(3.0f);
    }
}
