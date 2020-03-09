package com.yapt.demo.adapter.objectadapter;

/**
 * @author hurui
 * @version Id: PowerAdapter.java, v 0.1 2020/3/9 13:08 YaphetS Exp $$
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outPut5v() {
        int ac = ac220.inPut220v();
        int outPut5v = ac / 44;
        System.out.println("使用交流电输出"+outPut5v+"v");
        return outPut5v;
    }
}