package com.yapt.demo.factorymethod;

/**
 * @author hurui
 * @version Id: AliPay.java, v 0.1 2020/2/24 19:27 YaphetS Exp $$
 */
public class AliPay implements IPay {

    public void pay() {
        System.out.println("欢迎使用支付宝支付");
    }
}