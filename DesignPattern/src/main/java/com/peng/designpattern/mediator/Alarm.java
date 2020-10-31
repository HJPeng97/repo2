package com.peng.designpattern.mediator;

/**
 * 闹钟类,是一个具体的同事类
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    /**
     * 当闹钟响起时，会根据闹钟的状态进行相应的处理，
     * 如状态为0时发送信息给咖啡机提醒开始工作，状态为1时发送信息给电视机提醒关闭等
     * 由于使用了中介者模式，该方法不直接调用咖啡机或电视机等类，而是在中介者的getMessage（）方法中去调用，来完成相应业务
     * @param stateChange : 闹钟的状态
     */
    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用中介者的getMessage（）方法
        this.getMediator().getMessage(stateChange,getName());
    }
}
