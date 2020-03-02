package com.yapt.demo.singleton.simplefactory;

/**
 * @author hurui
 * @version Id: UnionPay.java, v 0.1 2020/2/24 19:29 YaphetS Exp $$
 */
public class UnionPay implements IPay {

    public void pay() {
        System.out.println("欢迎使用银联支付");
    }
}