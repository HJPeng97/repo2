package com.peng.designpattern.proxy.staticproxy;

/**
 * 目标对象
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教师教书");
    }
}
