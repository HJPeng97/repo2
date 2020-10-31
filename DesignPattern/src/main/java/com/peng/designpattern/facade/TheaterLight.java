package com.peng.designpattern.facade;

/**
 * 影院灯光类
 */
public class TheaterLight {
    private static TheaterLight ourInstance = new TheaterLight();

    public static TheaterLight getInstance() {
        return ourInstance;
    }

    private TheaterLight() {
    }

    public void on() {
        System.out.println("theaterLight is on....");
    }

    public void off() {
        System.out.println("theaterLight is off....");
    }

    public void bright() {
        System.out.println("theaterLight bright....");
    }

    public void dim() {
        System.out.println("theaterLight dim....");
    }
}
