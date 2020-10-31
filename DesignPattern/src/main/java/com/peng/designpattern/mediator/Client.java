package com.peng.designpattern.mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Alarm testAlarm = new Alarm(mediator, "TestAlarm");
        testAlarm.sendMessage(0);
        testAlarm.sendMessage(1);
    }
}
