package com.peng.designpattern.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("状态#1");

        //创建一个备忘录管理对象
        Caretaker caretaker = new Caretaker();
        //保存状态
        caretaker.addMemento(originator.saveStateMemento());
        System.out.println("经过一场大战,状态发生变化");
        originator.setState("状态#2");
        //保存状态
        caretaker.addMemento(originator.saveStateMemento());
        System.out.println("当前的状态：" + originator.getState());

        System.out.println("将状态恢复到之前的状态");
        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("当前的状态：" + originator.getState());
    }
}
