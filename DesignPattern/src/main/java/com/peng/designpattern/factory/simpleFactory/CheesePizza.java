package com.peng.designpattern.factory.simpleFactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料....");
    }
}
