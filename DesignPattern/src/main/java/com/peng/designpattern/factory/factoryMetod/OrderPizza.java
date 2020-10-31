package com.peng.designpattern.factory.factoryMetod;

import java.util.Scanner;

/**
 * 工厂类
 * 抽象类，提供一个抽象方法，让子类去实现（工厂方法模式）
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;

        do {
            String orderType = getType();
            pizza = this.CreatePizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("披萨订购成功！");
            } else {
                System.out.println("订购披萨失败！");
                break;
            }
        } while (true);
    }

    public abstract Pizza CreatePizza(String orderType);

    private String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要订购的披萨种类：");
        return scanner.next();
    }
}
