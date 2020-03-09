package com.yapt.demo.adapter.passport.adapterv2.adapters;

import com.yapt.demo.adapter.passport.ResultMsg;

/**
 * @author hurui
 * @version Id: LoginForTelAdapter.java, v 0.1 2020/3/9 14:25 YaphetS Exp $$
 */
public class LoginForTelAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
