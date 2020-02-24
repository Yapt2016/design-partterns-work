package com.yapt.demo.simplefactory;

/**
 * @author hurui
 * @version Id: SimpleFactoryTest.java, v 0.1 2020/2/24 19:38 YaphetS Exp $$
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        PayFactory payFactory = new PayFactory();
        payFactory.create(WeChatPay.class).pay();
        payFactory.create(AliPay.class).pay();
        payFactory.create(UnionPay.class).pay();
    }
}