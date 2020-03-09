package com.yapt.demo.adapter.classadapter;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/9 13:11 YaphetS Exp $$
 */
public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.outPut5v();
        //该适配器不仅能输出5v的交流电，还能输出220v的直流电，不符合最少知道原则
        powerAdapter.inPut220v();
    }
}