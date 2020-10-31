package com.peng.designpattern.mediator;

/**
 * 抽象类（中介者模式）
 * 家庭影院的各个组成部分都会继承此类，并在创建该类的实例时在构造器中注入一个中介者
 * 该类定义了两个方法，getMediator（）拿到对应的中介类,sendMessage（）向中介者发送消息，
 * 调用中介者的getMessage（）完成相关业务处理
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
