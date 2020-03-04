package com.yapt.demo.proxy.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hurui
 * @version Id: ZhiLianZhaoPin.java, v 0.1 2020/3/4 11:15 YaphetS Exp $$
 */
public class ZhiLianZhaoPin implements MethodInterceptor {


    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }


    private void before() {
        System.out.println("你好! 智联招聘开始为您服务！");
    }

    private void after() {
        System.out.println("已为您处理成功！");
    }
}