package com.yapt.demo.adapter.objectadapter;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/9 13:11 YaphetS Exp $$
 */
public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.outPut5v();
    }
}