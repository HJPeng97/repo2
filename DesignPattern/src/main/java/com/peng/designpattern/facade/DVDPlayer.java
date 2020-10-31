package com.peng.designpattern.facade;

public class DVDPlayer {
    private static DVDPlayer ourInstance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return ourInstance;
    }

    private DVDPlayer() {
    }

    public void on() {
        System.out.println("DVD is on....");
    }

    public void off() {
        System.out.println("DVD is off....");
    }

    public void play() {
        System.out.println("DVD is playing....");
    }

    public void pause() {
        System.out.println("DVD is pause....");
    }
}
