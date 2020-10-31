package com.peng.designpattern.adapter;

/**
 * 电压适配器，让手机可以在220V的电压上充电
 * 即5V的方法调用220V的方法
 *
 * 适配器模式有三种：类适配器、对象适配器、接口适配器
 *该适配器类为类适配器(继承被适配的类)
 */
public class VoltageClazzAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //拿到220V的电压
        int srcV = output220V();
        System.out.println("类适配器转成电压....");
        return srcV/44; // 转成5V
    }
}
