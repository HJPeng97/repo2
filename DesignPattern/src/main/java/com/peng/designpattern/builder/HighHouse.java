package com.peng.designpattern.builder;

public class HighHouse extends HouseBuilder {
    @Override
    public String buildBaise() {
        System.out.println("高楼大厦打地基....");
        return "50米的地基";
    }

    @Override
    public String buildWall() {
        System.out.println("高楼大厦砌墙....");
        return "豪华墙";
    }

    @Override
    public String buildRoofed() {
        System.out.println("高楼大厦封顶....");
        return "豪华屋顶";
    }
}
