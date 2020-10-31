package com.peng.designpattern.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        Duck pekingDuck = new PekingDuck();
        Duck toyDuck = new ToyDuck();
        show(wildDuck);
        show(pekingDuck);
        show(toyDuck);

        System.out.println("----测试Arrays.sort()的策略模式----");
        Integer[] data = {9,1,2,8,7,5};
        //Comparator接口相当于一个策略接口，这是实现了该接口的匿名内部类，是一个具体的策略接口
        //该接口是一个函数式接口，可以用lambda表达式来完成：Arrays.sort(data,(var1,var2) -> {....})
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //降序排序
                if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Arrays.sort(data,comparator); // 传入一个具体的排序策略，使用该策略进行排序
//        Arrays.sort(data); // 默认使用升序排序
        System.out.println(Arrays.toString(data));
    }

    private static void show(Duck duck) {
        System.out.println("----------");
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
    }
}
