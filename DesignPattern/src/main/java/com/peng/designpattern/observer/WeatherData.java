package com.peng.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象局类，充当被观察者的角色，维护观察者对象
 */
public class WeatherData implements Subject {
    private float temperature; // 温度
    private float pressure; // 气压
    private float humidity; // 湿度

    private List<Observer> observers; // 观察者的集合 （第三方网站或气象局自己的网站）

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observers.contains(observer)) {
            return;
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach( observer -> {
            observer.update(temperature,pressure,humidity);
        });
    }

    /**
     * 设置数据，当数据更新时会调用notifyObservers（）方法
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
