package com.peng.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 为信息工程学院提供遍历方法
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> departments;
    private int position = -1; // 遍历的位置

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size() - 1) {
            return false;
        } else {
            position++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(position);
    }
}
