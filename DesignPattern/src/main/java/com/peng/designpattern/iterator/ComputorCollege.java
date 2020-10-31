package com.peng.designpattern.iterator;

import java.util.Iterator;

public class ComputorCollege implements College {
    //需要聚合Department数组（与ComputerCollegeIterator对应）
    private Department[] departments;
    private int numOfDepartment = 0; // 记录department的个数

    public ComputorCollege() {
        departments = new Department[5];
        addDepartment("Java专业","培养Java人才");
        addDepartment("c++专业","培养c++人才");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments[numOfDepartment++] = department;
//        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
