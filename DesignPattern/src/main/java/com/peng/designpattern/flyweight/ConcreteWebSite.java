package com.peng.designpattern.flyweight;

public class ConcreteWebSite extends WebSite {
    //内部状态
    private String type = ""; // 网站发布的形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式为：" + type + ",使用者：" + user.getName());
    }
}
