package com.peng.designpattern.observer;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 当气象局的信息发生变化时，会调用该方法通知观察者
     * @param temperature : 温度
     * @param pressure : 气压
     * @param humidity : 湿度
     */
    void update(float temperature, float pressure, float humidity);
}
