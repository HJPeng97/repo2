package com.peng.designpattern.iterator;

import java.util.Iterator;

public interface College {
    /**
     * 返回学院的名字
     */
    String getName();

    /**
     * 为该学院添加一个系
     * @param name : 系名
     * @param des ： 系的描述
     */
    void addDepartment(String name,String des);

    /**
     * 添加一个迭代器
     */
    Iterator createIterator();
}
