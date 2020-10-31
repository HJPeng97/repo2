package com.peng.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院类，非叶子节点，可以管理Department
 */
public class College extends OrganizationComponent {
    //聚合一个OrganizationComponent，以便可以管理Department
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    /**
     * 添加Department
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //实际开发中，这里的添加业务逻辑可能不相同
        organizationComponents.add(organizationComponent);
    }

    /**
     * 删除Department
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        //实际开发中，这里的添加业务逻辑可能不相同
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
        System.out.println("------" + getName() + "------");
        System.out.println(getDes());
        organizationComponents.forEach(OrganizationComponent::print);
    }
}
