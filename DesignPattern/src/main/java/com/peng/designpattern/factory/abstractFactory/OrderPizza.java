package com.peng.designpattern.factory.abstractFactory;


import java.util.Scanner;

public class OrderPizza {
    private AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza = null;

        this.factory = factory;

        do {
            String orderType = getType();
            pizza = factory.createPizza(orderType);
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

    private String getType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要订购的披萨种类：");
        return scanner.next();
    }
}
