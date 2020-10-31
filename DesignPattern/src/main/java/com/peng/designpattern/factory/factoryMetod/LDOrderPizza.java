package com.peng.designpattern.factory.factoryMetod;

public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
