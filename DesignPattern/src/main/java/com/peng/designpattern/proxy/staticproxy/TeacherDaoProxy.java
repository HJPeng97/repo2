package com.peng.designpattern.proxy.staticproxy;

/**
 * 代理对象，代理TeacherDao类
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理....");
        target.teach();
        System.out.println("结束代理....");
    }
}
