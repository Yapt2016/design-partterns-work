package com.yapt.demo.abstractfactory;

/**
 * @author hurui
 * @version Id: PayFactory.java, v 0.1 2020/2/24 20:50 YaphetS Exp $$
 */
public abstract  class PayFactory {

    public void init(){
        System.out.println("初始化基础数据");
    }

    abstract IPay createPay();

    abstract IRefund createRefund();

}