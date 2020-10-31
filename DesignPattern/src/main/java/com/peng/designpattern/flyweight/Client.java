package com.peng.designpattern.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("新闻");
        webSite.use(new User("我"));
        WebSite webSite2 = webSiteFactory.getWebSite("博客");
        webSite2.use(new User("你"));
        WebSite webSite3 = webSiteFactory.getWebSite("博客");
        webSite3.use(new User("她"));
        System.out.println("网站分类的个数:" + webSiteFactory.getWebSiteCount());

        System.out.println("==========测试Integer=========");
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer w = 127; // 相当于Integer.valueOf(127)
        Integer z = new Integer(127);
        System.out.println(x == y);
        System.out.println(x == w);
        System.out.println(y == w);
        System.out.println(y == z);
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
