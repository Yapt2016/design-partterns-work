package com.yapt.demo.proxy.staticProxy;

import com.yapt.demo.proxy.Person;

/**
 * @author hurui
 * @version Id: ZhiLianZhaoPin.java, v 0.1 2020/3/4 11:15 YaphetS Exp $$
 */
public class ZhiLianZhaoPin implements Person {

    private Yapt yapt;

    public ZhiLianZhaoPin(Yapt yapt){
        this.yapt = yapt;
    }

    @Override
    public void findWork(String name) {
        before(name);
        yapt.findWork(name);
        after(name);
    }

    @Override
    public void findHouse(String address, Long price) {

    }


    private void before(String name) {
        System.out.println("你好，"+name+"! 智联招聘开始为你找工作");
    }

    private void after(String name) {
        System.out.println("恭喜你，"+name+"! 已为你找到一份Java开发的职位");
    }

}