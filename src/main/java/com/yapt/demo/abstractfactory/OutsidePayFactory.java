package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: InsidePayFactory.java, v 0.1 2020/2/24 20:51 YaphetS Exp $$
 */
public class OutsidePayFactory extends PayFactory{

    @Override
    IPay createPay() {
        super.init();
        return new OutsidePay();
    }

    @Override
    IRefund createRefund() {
        super.init();
        return new OutsideRefund();
    }
}