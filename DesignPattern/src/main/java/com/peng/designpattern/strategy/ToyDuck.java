package com.peng.designpattern.strategy;

public class ToyDuck extends Duck {
    public ToyDuck() {
        setFlyBehavior(new NoFlyBehavior());
        setQuackBehavior(new GeGeQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("我是玩具鸭，任人蹂躏~");
    }
}
