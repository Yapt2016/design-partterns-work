package com.yapt.demo.proxy.MyProxy.proxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public interface MyInvocationHandler {
     Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
