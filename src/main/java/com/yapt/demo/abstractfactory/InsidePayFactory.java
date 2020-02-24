package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: InsidePayFactory.java, v 0.1 2020/2/24 20:51 YaphetS Exp $$
 */
public class InsidePayFactory extends PayFactory{

    @Override
    IPay createPay() {
        super.init();
        return new InsidePay();
    }

    @Override
    IRefund createRefund() {
        super.init();
        return new InsideRefund();
    }
}