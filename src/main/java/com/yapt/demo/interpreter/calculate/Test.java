package com.yapt.demo.interpreter.calculate;

/**
 * Created by Tom.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("result: " + new GPCalculator("100 * 2 + 400 * 2 + 66").calculate());
    }

}
