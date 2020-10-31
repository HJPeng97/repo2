package com.peng.designpattern.visitor;

public abstract class Person {
    /**
     *
     * @param action
     */
    public abstract void accept(Action action);
}
