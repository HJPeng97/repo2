package com.peng.designpattern.factory.simpleFactory;

import java.util.Scanner;

public class OrderPizza {
//    private SimplePizzaFactory simplePizzaFactory;

//    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
//        setSimplePizzaFactory(simplePizzaFactory);
//    }

    public OrderPizza() {
//        setSimplePizzaFactory(simplePizzaFactory);
        setSimplePizzaFactory();
    }

    public void setSimplePizzaFactory(/* SimplePizzaFactory simplePizzaFactory */) {
        Pizza pizza = null;

//        this.simplePizzaFactory = simplePizzaFactory;

        do {
            String orderType = getType();
//            pizza = this.simplePizzaFactory.createPizza(orderType);
            pizza = SimplePizzaFactory.createPizza(orderType);
            if (pizza != null) {
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
