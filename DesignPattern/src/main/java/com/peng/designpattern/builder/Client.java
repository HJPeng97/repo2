package com.peng.designpattern.builder;

public class Client {
    public static void main(String[] args) {
        //盖一栋普通房子
        CommonHouse commonHouse = new CommonHouse();
        //创建一个指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println("普通房子已建好：" + house);

        //盖一幢高楼大厦
        HighHouse highHouse = new HighHouse();
        //重置指挥者
        houseDirector.setHouseBuilder(highHouse);
        House house1 = houseDirector.constructHouse();
        System.out.println("高楼大厦已建好：" + house1);
    }
}
