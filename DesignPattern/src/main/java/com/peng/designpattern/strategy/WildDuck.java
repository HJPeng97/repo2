package com.peng.designpattern.strategy;

public class WildDuck extends Duck {
    public WildDuck() {
        setFlyBehavior(new CanFlyBehavior());
        setQuackBehavior(new GaGaQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("我是野鸭子，逍遥又自在~");
    }
}
