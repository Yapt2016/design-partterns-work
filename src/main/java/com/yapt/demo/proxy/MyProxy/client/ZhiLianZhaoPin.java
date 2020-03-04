package com.yapt.demo.proxy.MyProxy.client;

import com.yapt.demo.proxy.MyProxy.proxy.MyClassLoader;
import com.yapt.demo.proxy.MyProxy.proxy.MyInvocationHandler;
import com.yapt.demo.proxy.MyProxy.proxy.MyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hurui
 * @version Id: ZhiLianZhaoPin.java, v 0.1 2020/3/4 11:15 YaphetS Exp $$
 */
public class ZhiLianZhaoPin implements MyInvocationHandler {

    private Object obj;

    public Object getInstance(Object obj){
        this.obj = obj;
        Class clazz = obj.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result = method.invoke(this.obj,args);
        after();
        return result;
    }

    private void before() {
        System.out.println("你好! 智联招聘开始为您服务！");
    }

    private void after() {
        System.out.println("已为您处理成功！");
    }


}