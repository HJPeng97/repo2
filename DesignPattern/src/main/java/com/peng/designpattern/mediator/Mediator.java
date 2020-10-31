package com.peng.designpattern.mediator;

/**
 * 中介者抽象类
 * 其子类会去维护一个具体同事类的集合，并可以使用register()方法将具体同事注册进集合中
 * getMessage（）方法处理相应的业务
 */
public abstract class Mediator {
    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
