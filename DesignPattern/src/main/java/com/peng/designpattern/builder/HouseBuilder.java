package com.peng.designpattern.builder;

public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 打地基（创建地基）
     */
    public abstract String buildBaise();

    /**
     * 建造墙
     */
    public abstract String buildWall();

    /**
     * 建造屋顶（封顶）
     */
    public abstract String buildRoofed();

    /**
     * 返回建造好的房子
     */
    public House build(String baise,String wall,String roofed) {
        house.setBaise(baise);
        house.setWall(wall);
        house.setRoofed(roofed);
        return house;
    }
}
