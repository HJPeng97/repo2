package com.peng.designpattern.factory.factoryMetod;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
