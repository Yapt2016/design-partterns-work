package com.yapt.demo.builder;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/2 21:55 YaphetS Exp $$
 */
public class Test {


    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.setChuLiQi("i7").setNeiCun("32G").setZhuBan("华硕B360").setXianKa("GTX1080ti");

        System.out.println(builder.build());
    }
}