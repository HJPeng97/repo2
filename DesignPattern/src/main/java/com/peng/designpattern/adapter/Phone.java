package com.peng.designpattern.adapter;

/**
 * 手机类，可以充电
 */
public class Phone {
    /**
     * 充电的方法
     * @param iVoltage5V ：适配接口，手机能接受的电压
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压过高，不能充电");
        }
    }
}
