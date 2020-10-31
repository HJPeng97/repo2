package com.peng.designpattern.bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机开机....");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机....");
    }
}
