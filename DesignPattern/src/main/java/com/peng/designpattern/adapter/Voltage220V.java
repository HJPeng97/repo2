package com.peng.designpattern.adapter;

/**
 * 被适配的类
 * 充电的电压 220V
 */
public class Voltage220V {
    /**
     * 输出220V的电压
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
