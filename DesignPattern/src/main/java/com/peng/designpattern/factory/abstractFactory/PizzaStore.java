package com.peng.designpattern.factory.abstractFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
        System.out.println("程序退出~");
    }
}
