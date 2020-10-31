package com.peng.designpattern.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        //创建一个代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
