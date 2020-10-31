package com.peng.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类，根据网站展示的类型不同返回相应的网站
 */
public class WebSiteFactory {
    //创建一个容器，相当于池的作用
    private Map<String,ConcreteWebSite> pool = new HashMap<String, ConcreteWebSite>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    /**
     * 获取网站分类的总数
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
