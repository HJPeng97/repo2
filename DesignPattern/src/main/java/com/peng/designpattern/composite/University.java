package com.peng.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校类，非叶子节点，可以管理College
 */
public class University extends OrganizationComponent {
    //聚合一个OrganizationComponent，以便可以管理College
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    /**
     * 添加College
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    /**
     * 删除College
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println("---------" + getName() + "---------");
        System.out.println(getDes());
        organizationComponents.forEach(OrganizationComponent::print);
    }
}
