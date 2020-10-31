package com.peng.designpattern.visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("该歌手得到了男人的一个好评....");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("该歌手得到了女人的一个好评....");
    }
}
