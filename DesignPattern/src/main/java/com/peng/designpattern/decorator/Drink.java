package com.peng.designpattern.decorator;

public abstract class Drink {
    private String des; // 描述
    private float price = 0.0f;

    /**
     * 计算价格
     */
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
