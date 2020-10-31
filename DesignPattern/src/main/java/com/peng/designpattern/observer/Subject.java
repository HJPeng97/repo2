package com.peng.designpattern.observer;

/**
 * 被观察者接口，定义一些方法管理观察者
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
