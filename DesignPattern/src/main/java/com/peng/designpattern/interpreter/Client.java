package com.peng.designpattern.interpreter;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        String exp = "a+b-c+d";
        HashMap<String, Integer> var = new HashMap<>();
        var.put("a",4);
        var.put("b",3);
        var.put("c",2);
        var.put("d",1);
        Calculator calculator = new Calculator(exp);
        int result = calculator.run(var);
        System.out.println("a+b-c+d=" + result);
    }
}
