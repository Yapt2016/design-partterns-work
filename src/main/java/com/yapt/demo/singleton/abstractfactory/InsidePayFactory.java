package com.yapt.demo.singleton.abstractfactory;

/**
 * @author hurui
 * @version Id: InsidePayFactory.java, v 0.1 2020/2/24 20:51 YaphetS Exp $$
 */
public abstract class InsidePayFactory implements PayFactory{

    public void init(){
        System.out.println("境内支付场景识别");
    }
    public abstract IPay createPay();
}