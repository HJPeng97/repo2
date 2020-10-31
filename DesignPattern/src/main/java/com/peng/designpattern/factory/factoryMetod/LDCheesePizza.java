package com.peng.designpattern.factory.factoryMetod;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨 ");
        System.out.println("给伦敦的奶酪披萨准备原材料....");
    }
}
