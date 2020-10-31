package com.peng.designpattern.adapter;

/**
 * 适配接口
 * 手机可以接受的电压 5V
 */
public interface IVoltage5V {
    /**
     * 输出5V的电压
     */
    public int output5V();
}
