package com.peng.designpattern.interpreter;

import java.util.HashMap;

/**
 * 表达式的抽象类 （解释器模式）
 * 有一个解释的方法，可以获取到变量的值
 */
public abstract class Expression {
    /**
     * 获取变量的值
     * @param var : 一个Map集合，key为变量（a、b、c等），value为该变量具体的值
     * @return
     */
    public abstract int interpreter(HashMap<String,Integer> var);
}
