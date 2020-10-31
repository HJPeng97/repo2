package com.peng.designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体的中介者类，聚合所有的具体同事类（用集合的方式）
 */
public class ConcreteMediator extends Mediator {
    private Map<String,Colleague> colleagues = new HashMap<>();
    private Map<String,String> interMap = new HashMap<>(); // ??

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagues.put(colleagueName,colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm",colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagues.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                System.out.println("闹钟状态为0，可以调用相关方法完成相应操作....");
            } else if (stateChange == 1) {
                System.out.println("闹钟状态为1，可以调用相关方法完成相应操作....");
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}
