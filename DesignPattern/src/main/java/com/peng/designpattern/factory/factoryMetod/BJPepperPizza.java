package com.peng.designpattern.factory.factoryMetod;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒披萨 ");
        System.out.println("给北京的胡椒披萨准备原材料....");
    }
}
