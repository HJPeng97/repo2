package com.peng.designpattern.bridge;

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi手机开机....");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi手机关机....");
    }
}
