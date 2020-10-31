package com.peng.designpattern.template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("=================");
        SoyaMilk pennutSoyaMilk = new PeanutSoyaMilk();
        pennutSoyaMilk.make();
        System.out.println("=====制作纯豆浆======");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
