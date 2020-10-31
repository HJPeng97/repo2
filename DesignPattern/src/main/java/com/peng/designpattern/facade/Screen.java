package com.peng.designpattern.facade;

public class Screen {
    private static Screen ourInstance = new Screen();

    public static Screen getInstance() {
        return ourInstance;
    }

    private Screen() {
    }

    public void up() {
        System.out.println("screen up....");
    }

    public void down() {
        System.out.println("screen down....");
    }
}
