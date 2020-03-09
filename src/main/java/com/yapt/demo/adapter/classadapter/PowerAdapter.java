package com.yapt.demo.adapter.classadapter;

/**
 * @author hurui
 * @version Id: PowerAdapter.java, v 0.1 2020/3/9 13:08 YaphetS Exp $$
 */
public class PowerAdapter extends AC220 implements DC5{

    @Override
    public int outPut5v() {
        int ac220 = super.inPut220v();
        int outPut5v = ac220 / 44;
        System.out.println("使用交流电输出"+outPut5v+"v");
        return outPut5v;
    }
}