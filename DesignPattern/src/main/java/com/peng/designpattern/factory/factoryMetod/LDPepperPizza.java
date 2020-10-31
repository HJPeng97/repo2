package com.peng.designpattern.factory.factoryMetod;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨 ");
        System.out.println("给伦敦的胡椒披萨准备原材料....");
    }
}
