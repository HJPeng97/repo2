package com.peng.designpattern.bridge;

public abstract class Phone {
    //组合手机的品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }
}
