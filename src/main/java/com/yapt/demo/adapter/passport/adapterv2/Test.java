package com.yapt.demo.adapter.passport.adapterv2;

import com.yapt.demo.adapter.passport.adapterv2.adapters.LoginForDouYinAdapter;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/9 14:24 YaphetS Exp $$
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.login("sdfasdfasfasfas", LoginForDouYinAdapter.class);
    }
}
