package com.peng.designpattern.facade;

/**
 * 投影仪类
 */
public class Projector {
    private static Projector ourInstance = new Projector();

    public static Projector getInstance() {
        return ourInstance;
    }

    private Projector() {
    }

    public void on() {
        System.out.println("projector is on....");
    }

    public void off() {
        System.out.println("projector is off....");
    }

    public void focus() {
        System.out.println("projector is focus....");
    }
}
