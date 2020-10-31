package com.peng.designpattern.composite;


public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("天津理工大学", "我的母校");

        OrganizationComponent college = new College("华信软件学院", "人才辈出的学院");
        College college1 = new College("计算机学院", "不错的学院");
        College college2 = new College("外国语学院", "漂亮妹子多的学院");

        Department department = new Department("软件工程", "铸造高级程序员");
        Department department1 = new Department("计算机科学与技术", "还可以");
        Department department2 = new Department("英语", "English");
        Department department3 = new Department("德语", "不会");

        university.add(college);
        college.add(department);
        university.add(college1);
        college1.add(department1);
        university.add(college2);
        college2.add(department2);
        college2.add(department3);

        university.print();
    }
}
