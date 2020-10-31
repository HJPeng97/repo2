package com.peng.designpattern.adapter;

/**
 * 电压适配器，让手机可以在220V的电压上充电
 * 即5V的方法调用220V的方法
 *
 * 适配器模式有三种：类适配器、对象适配器、接口适配器
 *该适配器类为对象适配器(聚合被适配的类)
 */
public class VoltageObjAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageObjAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (voltage220V != null) {
            //拿到220V的电压
            int srcV = voltage220V.output220V();
            System.out.println("对象适配器转成电压....");
            dstV = srcV/44; // 转成5V
        }
        return dstV;
    }
}
