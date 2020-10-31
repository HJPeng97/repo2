package com.peng.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    private List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("信息安全专业","培养信息安全人才");
        addDepartment("网络安全专业","培养网络安全人才");
    }

    @Override
    public String getName() {
        return "信息工程专业";
    }

    @Override
    public void addDepartment(String name, String des) {
        departments.add(new Department(name, des));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
