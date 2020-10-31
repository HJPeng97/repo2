package com.peng.designpattern.builder;

/**
 * 建造房子的指挥者，控制建造房子的流程
 */
public class HouseDirector {
    //聚合一个builder
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 处理建造房子的流程
     * @return
     */
    public House constructHouse() {
        String baise = houseBuilder.buildBaise();
        String wall = houseBuilder.buildWall();
        String roofed = houseBuilder.buildRoofed();
        return houseBuilder.build(baise,wall,roofed);
    }
}
