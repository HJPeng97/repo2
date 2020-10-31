package com.peng.designpattern.memento;

public class Originator {
    private String state; // 玩家的状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 该方法用来保存状态信息
     */
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象获取状态 ， 用来做恢复状态用
     */
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
