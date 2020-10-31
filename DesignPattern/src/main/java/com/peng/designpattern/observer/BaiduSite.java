package com.peng.designpattern.observer;

public class BaiduSite implements Observer {
    private float temperature; // 温度
    private float pressure; // 气压
    private float humidity; // 湿度

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("=======百度网站=======");
        System.out.println("现在的天气情况：");
        System.out.println("温度：" + temperature);
        System.out.println("气压：" + pressure);
        System.out.println("湿度：" + humidity);
    }
}
