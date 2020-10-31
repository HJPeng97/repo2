package com.peng.designpattern.adapter;

/**
 * 适配器模式： 接口适配器
 * 抽象的适配器类，将适配接口的全部方法都默认空实现，客户端使用时用匿名内部类的方式去覆盖需要的方法，而达到接口隔离的效果
 */
public abstract class VoltageInterfaceAdapter implements IVoltage5V {
    @Override
    public int output5V() {
        return 0;
    }
}
