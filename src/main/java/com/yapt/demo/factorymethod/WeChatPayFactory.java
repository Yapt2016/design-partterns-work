package com.yapt.demo.factorymethod;

/**
 * @author hurui
 * @version Id: AliPayFactory.java, v 0.1 2020/2/24 19:45 YaphetS Exp $$
 */
public class WeChatPayFactory implements IPayFactory{


    public IPay create() {
        return new WeChatPay();
    }
}