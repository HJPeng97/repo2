package com.peng.designpattern.visitor;

/**
 * 测评抽象类，有两个方法，分别得到男性和女性的测评结果
 */
public abstract class Action {
    /**
     * 得到男性的测评结果
     */
    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
