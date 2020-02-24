package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: AbstractFactoryTest.java, v 0.1 2020/2/24 21:15 YaphetS Exp $$
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        PayFactory payFactory = new InsidePayFactory();
        payFactory.createPay().pay();
        payFactory.createRefund().refund();
    }
}