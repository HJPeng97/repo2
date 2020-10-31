package com.peng.designpattern.prototype;

import java.io.Serializable;

/**
 * 测试克隆对象时的浅拷贝
 */
public class CloneTest implements Serializable,Cloneable {
    private String name;

    public CloneTest(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
