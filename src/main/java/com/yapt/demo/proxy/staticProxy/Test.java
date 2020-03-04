package com.yapt.demo.proxy.staticProxy;

import com.yapt.demo.proxy.Person;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/4 11:18 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {
        ZhiLianZhaoPin zz = new ZhiLianZhaoPin(new Yapt());
        zz.findWork("Yapt");

    }
}