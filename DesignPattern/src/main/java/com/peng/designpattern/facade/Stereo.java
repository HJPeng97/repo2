package com.peng.designpattern.facade;

/**
 * 立体声类
 */
public class Stereo {
    private static Stereo ourInstance = new Stereo();

    public static Stereo getInstance() {
        return ourInstance;
    }

    private Stereo() {
    }

    public void on() {
        System.out.println("stereo is on....");
    }

    public void off() {
        System.out.println("stereo is off....");
    }

    public void up() {
        System.out.println("stereo up....");
    }

    public void down() {
        System.out.println("stereo down....");
    }
}
