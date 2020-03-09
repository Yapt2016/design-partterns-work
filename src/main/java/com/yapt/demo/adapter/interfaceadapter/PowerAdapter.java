package com.yapt.demo.adapter.interfaceadapter;

/**
 * @author hurui
 * @version Id: PowerAdapter.java, v 0.1 2020/3/9 13:08 YaphetS Exp $$
 */
public class PowerAdapter implements DC {

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

    @Override
    public int outPut12v() {
        int ac = ac220.inPut220v();
        int outPut12v = ac * 12/ ac;
        System.out.println("使用交流电输出"+outPut12v+"v");
        return outPut12v;
    }

    @Override
    public int outPut22v() {
        int ac = ac220.inPut220v();
        int outPut22v = ac * 22/ ac;
        System.out.println("使用交流电输出"+outPut22v+"v");
        return outPut22v;
    }

    @Override
    public int outPut36v() {
        int ac = ac220.inPut220v();
        int outPut36v = ac * 36/ ac;
        System.out.println("使用交流电输出"+outPut36v+"v");
        return outPut36v;
    }
}