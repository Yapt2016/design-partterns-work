package com.yapt.demo.adapter.passport.adapterv2.adapters;

import com.yapt.demo.adapter.passport.ResultMsg;

/**
 * @author hurui
 * @version Id: LoginForWechatAdapter.java, v 0.1 2020/3/9 14:26 YaphetS Exp $$
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
