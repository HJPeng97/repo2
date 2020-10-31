package com.peng.designpattern.decorator;

public class LongBlack extends Coffee {
    public LongBlack() {
        setPrice(5.0f);
        setDes(" longblack" + getPrice());
    }
}
