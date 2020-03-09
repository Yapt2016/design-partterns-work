package com.yapt.demo.adapter.passport.adapterv1;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/9 14:22 YaphetS Exp $$
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("tom","123456");
        adapter.loginForQQ("sjooguwoersdfjhasjfsa");
        adapter.loginForWechat("slfsjoljsdo8234ssdfs");
    }
}