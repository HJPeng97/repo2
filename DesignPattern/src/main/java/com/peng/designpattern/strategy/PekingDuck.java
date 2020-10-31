package com.peng.designpattern.strategy;

public class PekingDuck extends Duck {
    public PekingDuck() {
        setFlyBehavior(new NoFlyBehavior());
        setQuackBehavior(new NoQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("我是北京鸭，我熟透了~");
    }
}
