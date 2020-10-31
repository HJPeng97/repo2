package com.peng.designpattern.factory.abstractFactory;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪披萨 ");
        System.out.println("给北京的奶酪披萨准备原材料....");
    }
}
