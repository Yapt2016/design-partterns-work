package com.yapt.demo.singleton.simplefactory;

/**
 * @author hurui
 * @version Id: payFactory.java, v 0.1 2020/2/24 19:24 YaphetS Exp $$
 */
public class PayFactory {

    public IPay create(Class<? extends IPay> clazz){
        try{
            if(null != clazz){
                return (IPay) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}