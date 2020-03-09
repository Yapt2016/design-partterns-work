package com.yapt.demo.adapter.interfaceadapter;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/9 13:11 YaphetS Exp $$
 */
public class Test {
    public static void main(String[] args) {
        DC dc = new PowerAdapter(new AC220());
        dc.outPut5v();

        dc.outPut12v();

        dc.outPut22v();

        dc.outPut36v();
    }
}