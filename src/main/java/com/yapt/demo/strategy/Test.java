package com.yapt.demo.strategy;

import com.yapt.demo.strategy.model.MsgResult;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/15 18:24 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {
        AssistanceStrategy strategy = new AssistanceStrategy();
        MsgResult result = strategy.getStrategy("123").assistance();
        System.out.println(result);
    }
}