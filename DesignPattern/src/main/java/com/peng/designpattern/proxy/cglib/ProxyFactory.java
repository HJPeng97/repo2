package com.peng.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 通过cglib的方式实现代理，需要继承MethodInterceptor接口
 */
public class ProxyFactory implements MethodInterceptor {
    //聚合目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 通过cglib实现代理，分为四个步骤
     */
    public Object getProxyInstance() {
        //1、创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2、设置父类
        enhancer.setSuperclass(target.getClass());
        //3、设置回调函数
        enhancer.setCallback(this);
        //4、创建子类对象(即代理对象),并返回
        return enhancer.create();
    }

    /**
     * 重写该方法，会在调用目标对象的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理开始....");
        Object resultVal = method.invoke(target, objects);
        System.out.println("cglib动态代理提交");
        return resultVal;
    }
}
