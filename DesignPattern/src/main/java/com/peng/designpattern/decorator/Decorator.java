package com.peng.designpattern.decorator;

/**
 * 装饰者类
 * 这里为调料类
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    /**
     * super.getPrice()是自己的价格
     */
    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + getPrice() + "&&" + drink.getDes() + " ";
    }
}
