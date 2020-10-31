package com.peng.designpattern.interpreter;

import java.util.HashMap;

/**
 * 加法的表达式，实现两个数相加
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 计算左和右两个数的和
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
