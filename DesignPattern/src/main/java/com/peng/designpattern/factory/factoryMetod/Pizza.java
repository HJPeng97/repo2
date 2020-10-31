package com.peng.designpattern.factory.factoryMetod;

public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "正在烘焙....");
    }

    public void cut() {
        System.out.println(name + "正在切割....");
    }

    public void box() {
        System.out.println(name + "正在打包....");
    }

    public void setName(String name) {
        this.name = name;
    }
}
