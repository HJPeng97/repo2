package com.peng.designpattern.adapter;

/**
 * 客户端，用户使用手机，可以给手机充电
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //类适配器
        VoltageClazzAdapter voltageClazzAdapter = new VoltageClazzAdapter();
        phone.charging(voltageClazzAdapter);
        //对象适配器
        System.out.println("===================");
        VoltageObjAdapter voltageObjAdapter = new VoltageObjAdapter(new Voltage220V());
        phone.charging(voltageObjAdapter);
        //接口适配器
        System.out.println("===================");
        VoltageInterfaceAdapter voltageInterfaceAdapter = new VoltageInterfaceAdapter() {
            @Override
            public int output5V() {
                Voltage220V voltage220V = new Voltage220V();
                int dstV = 0;
                //拿到220V的电压
                int srcV = voltage220V.output220V();
                System.out.println("接口适配器转成电压....");
                dstV = srcV/44; // 转成5V
                return dstV;
            }
        };
        phone.charging(voltageInterfaceAdapter);
    }
}
