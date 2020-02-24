package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: AliPay.java, v 0.1 2020/2/24 19:27 YaphetS Exp $$
 */
public class AliPay implements IPay ,IRefund{


    public void pay() {
        System.out.println("欢迎使用支付宝支付");
    }

    public void refund() {
        System.out.println("欢迎使用支付宝退款");
    }
}