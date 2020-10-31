package com.peng.designpattern.builder;

public class CommonHouse extends HouseBuilder {
    @Override
    public String buildBaise() {
        System.out.println("普通房子打地基....");
        return "5米的地基";
    }

    @Override
    public String buildWall() {
        System.out.println("普通房子砌墙....");
        return "普通墙";
    }

    @Override
    public String buildRoofed() {
        System.out.println("普通房子封顶....");
        return "普通屋顶";
    }
}
