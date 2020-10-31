package com.peng.designpattern.responsibilitychain;

/**
 * 购买的请求
 */
public class PurchaseRequest {
    private int type = 0; // 请求类型
    private float price = 0.0f; // 请求的金额
    static int id = 0;

    public PurchaseRequest(int type, float price) {
        this.type = type;
        this.price = price;
        ++id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }
}
