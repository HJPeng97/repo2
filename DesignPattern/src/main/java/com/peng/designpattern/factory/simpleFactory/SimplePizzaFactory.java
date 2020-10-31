package com.peng.designpattern.factory.simpleFactory;

/**
 * 简单工厂模式，也叫静态工厂模式（可以将方法写成静态方法）
 */
public class SimplePizzaFactory {
//    public Pizza createPizza(String orderType) {
//        Pizza pizza = null;
//        if ("greek".equals(orderType)) {
//            pizza = new GreekPizza();
//            pizza.setName("希腊披萨 ");
//        } else if ("cheese".equals(orderType)) {
//            pizza = new CheesePizza();
//            pizza.setName("奶酪披萨 ");
//        }
//        return pizza;
//    }

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨 ");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨 ");
        }
        return pizza;
    }
}
