package com.peng.designpattern.facade;

/**
 * 爆米花类
 */
public class Popcorn {
    private static Popcorn ourInstance = new Popcorn();

    public static Popcorn getInstance() {
        return ourInstance;
    }

    private Popcorn() {
    }

    public void on() {
        System.out.println("popcorn is on....");
    }

    public void off() {
        System.out.println("popcorn is off....");
    }

    public void pop() {
        System.out.println("popcorn is popping....");
    }
}
