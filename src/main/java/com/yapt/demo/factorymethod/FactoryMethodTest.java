package com.yapt.demo.factorymethod;

/**
 * @author hurui
 * @version Id: FactoryMethodTest.java, v 0.1 2020/2/24 19:50 YaphetS Exp $$
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IPayFactory iPayFactory1 = new AliPayFactory();
        iPayFactory1.create().pay();

        IPayFactory iPayFactory2 = new WeChatPayFactory();
        iPayFactory2.create().pay();

        IPayFactory iPayFactory3 = new UnionPayFactory();
        iPayFactory3.create().pay();
    }
}