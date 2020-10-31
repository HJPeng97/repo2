package com.peng.designpattern.memento;

/**
 * 备忘录类，用来记录玩家的信息
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
