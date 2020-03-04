package com.yapt.demo.proxy.MyProxy.client;

import java.lang.reflect.Method;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/4 11:18 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {

        try {
            Object obj = new ZhiLianZhaoPin().getInstance(new Yapt());
            Method method1 = obj.getClass().getMethod("findWork",String.class);
            method1.invoke(obj,"yapt");

            System.out.println("-----------------------------------------------------------------");

            Method method2 = obj.getClass().getMethod("findHouse",String.class,Long.class);
            method2.invoke(obj,"浦东新区",3000L);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}