package com.peng.designpattern.iterator;

import java.util.Iterator;

/**
 * 为计算机学院提供遍历
 */
public class ComputerCollegeIterator implements Iterator {
    //需要知道Department是以什么样的形式存放的
    private Department[] departments;
    private int position = 0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }
}
