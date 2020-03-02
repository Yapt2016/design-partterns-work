package com.yapt.demo.singleton.abstractfactory;

/**
 * @author hurui
 * @version Id: AliPayFactory.java, v 0.1 2020/2/24 22:40 YaphetS Exp $$
 */
public class UnionPayFactory extends InsidePayFactory{

    @Override
    public IPay createPay() {
        super.init();
        return new UnionPay();
    }
}