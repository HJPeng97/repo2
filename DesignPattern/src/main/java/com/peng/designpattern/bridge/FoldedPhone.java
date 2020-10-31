package com.peng.designpattern.bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("折叠样式手机:");
        super.open();
    }

    @Override
    protected void close() {
        System.out.print("折叠样式手机:");
        super.close();
    }
}
