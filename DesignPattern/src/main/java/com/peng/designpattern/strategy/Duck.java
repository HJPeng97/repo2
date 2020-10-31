package com.peng.designpattern.strategy;

/**
 * 鸭子抽象类，其子类为具体种类的鸭子
 * 所有的鸭子都会游泳，所以不需要游泳的策略类
 */
public abstract class Duck {
    //定义一组策略接口（算法族）,子类去选择相应的策略子类去实现
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /**
     * 展示鸭子的信息
     */
    public abstract void display();

    /**
     * 鸭子飞翔的方法，每个鸭子都有可能不同，因此调用子类的具体策略去实现
     */
    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    /**
     * 鸭子叫的方法，每个鸭子都有可能不同，因此调用子类的具体策略去实现
     */
    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    /**
     * 所有的鸭子都会游泳，即所有的Duck类的该发法的实现都是这个
     */
    public void swim() {
        System.out.println("本鸭子会游泳....");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
