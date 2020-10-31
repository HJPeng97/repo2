package com.peng.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 遍历输出各个学院的各个系
 */
public class OutputImpl {
    //学院的集合
    private List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    /**
     * 遍历各个学院，并调用printDepartments输出学院里各个系的信息
     */
    public void printCollege() {
        colleges.forEach(college -> {
            System.out.println("=====" + college.getName() + "=====");
            printDepartments(college.createIterator());
        });
    }

    /**
     * 遍历输出各个系的信息
     */
    private void printDepartments(Iterator iterator) {
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.toString());
        }
    }
}
