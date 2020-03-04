package com.yapt.demo.proxy.CglibProxy;

import com.yapt.demo.proxy.Person;

/**
 * @author hurui
 * @version Id: Yapt.java, v 0.1 2020/3/4 11:14 YaphetS Exp $$
 */
public class Yapt {


    public void findWork(String name) {
        System.out.println("姓名:"+name+"\r\n"+"工作:JAVA");
    }


    public void findHouse(String address, Long price) {
        System.out.println("房子位置:"+address+"\r\n"+"房子价格:"+price);
    }
}