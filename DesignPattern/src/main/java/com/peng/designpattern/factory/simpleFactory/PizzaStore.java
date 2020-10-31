package com.peng.designpattern.factory.simpleFactory;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new SimplePizzaFactory());
        new OrderPizza();
        System.out.println("退出程序~");
    }
}
