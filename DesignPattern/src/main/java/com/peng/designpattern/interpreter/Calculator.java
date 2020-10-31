package com.peng.designpattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算表达式
 */
public class Calculator {
    private Expression expression;

    /**
     * 传入一个字符串形式的表达式，并解析表达式
     * @param expStr : 字符串形式的表达式
     */
    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>(); // 创建一个栈，存放表达式
        //定义左表达式和右表达式
        Expression left = null;
        Expression right = null;

        char[] chars = expStr.toCharArray();
        //将字符串形式的表达式解析成Expression类型的表达式
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }

        this.expression = stack.pop(); // 解析好的表达式
    }

    /**
     * 执行表达式的运算结果并返回给客户端
     */
    public int run(HashMap<String,Integer> var) {
        return this.expression.interpreter(var);
    }
}
