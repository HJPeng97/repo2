package com.peng.designpattern.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        //注册观察者
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        weatherData.setData(30f,120f,40f);
        weatherData.removeObserver(baiduSite);
        System.out.println("====天气发生变化====");
        weatherData.setData(20f,110f,50f);
    }
}
