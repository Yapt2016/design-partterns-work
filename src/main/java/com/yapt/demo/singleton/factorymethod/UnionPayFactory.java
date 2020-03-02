package com.yapt.demo.singleton.factorymethod;

/**
 * @author hurui
 * @version Id: AliPayFactory.java, v 0.1 2020/2/24 19:45 YaphetS Exp $$
 */
public class UnionPayFactory implements IPayFactory{


    public IPay create() {
        return new UnionPay();
    }
}