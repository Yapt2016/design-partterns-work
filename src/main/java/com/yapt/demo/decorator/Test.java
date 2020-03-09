package com.yapt.demo.decorator;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/7 16:17 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {

        OpenCommunity openCommunity;
        openCommunity = new CommonOpenCommunity();
        System.out.println("未登录获取到的导航栏:"+openCommunity.getDirectory());

        openCommunity = new LoginDecorator(openCommunity);
        System.out.println("登录下获取到的导航栏:"+openCommunity.getDirectory());
    }
}