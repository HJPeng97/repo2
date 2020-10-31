package com.peng.designpattern.decorator;

public class Espresso extends Coffee {
    /**
     * 设置咖啡描述和价钱
     */
    public Espresso() {
        setPrice(6.0f);
        setDes(" 意大利咖啡" + getPrice());
    }
}
