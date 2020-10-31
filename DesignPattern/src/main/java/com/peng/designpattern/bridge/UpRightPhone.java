package com.peng.designpattern.bridge;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("直立样式手机:");
        super.open();

    }

    @Override
    protected void close() {
        System.out.print("直立样式手机:");
        super.close();
    }
}
