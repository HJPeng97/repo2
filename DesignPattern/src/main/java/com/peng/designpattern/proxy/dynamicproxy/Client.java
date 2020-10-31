package com.peng.designpattern.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        //动态创建代理对象 (需要强转成目标对象的类型)
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        //通过代理对象调用目标对象的方法
        proxyInstance.teach();
    }
}
