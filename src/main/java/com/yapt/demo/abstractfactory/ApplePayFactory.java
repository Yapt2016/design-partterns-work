package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: AliPayFactory.java, v 0.1 2020/2/24 22:40 YaphetS Exp $$
 */
public class ApplePayFactory extends OutsidePayFactory{

    @Override
    public IPay createPay() {
        super.init();
        return new ApplePay();
    }
}