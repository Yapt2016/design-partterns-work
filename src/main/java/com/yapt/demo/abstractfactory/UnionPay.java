package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: UnionPay.java, v 0.1 2020/2/24 19:29 YaphetS Exp $$
 */
public class UnionPay implements IPay ,IRefund{

    public void pay() {
        System.out.println("欢迎使用银联支付");
    }

    public void refund() {
        System.out.println("欢迎使用银联退款");
    }
}