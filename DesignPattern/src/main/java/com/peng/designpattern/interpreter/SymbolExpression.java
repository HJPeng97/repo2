package com.peng.designpattern.interpreter;

import java.util.HashMap;

/**
 * 符号的表达式
 * 每一个符号都只和左和右的数字有关系，但左和右的数字也可能是解析后的结果，但都是Expression类型的
 */
public class SymbolExpression extends Expression {
    protected Expression left; // 左边的数字
    protected Expression right; // 右边的数字

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 因为SymbolExpression是让其子类来实现，因此该方法是一个默认实现
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
