package com.yapt.demo.proxy.CglibProxy;

import java.lang.reflect.Method;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/4 11:18 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {

        try {
            Yapt yapt = (Yapt)new ZhiLianZhaoPin().getInstance(Yapt.class);
            yapt.findWork("Yapt");
            System.out.println("-----------------------------------------------------------------");
            yapt.findHouse("浦东新区",3000L);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}