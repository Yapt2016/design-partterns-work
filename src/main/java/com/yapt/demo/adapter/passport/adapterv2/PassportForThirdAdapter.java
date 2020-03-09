package com.yapt.demo.adapter.passport.adapterv2;

import com.yapt.demo.adapter.passport.ResultMsg;
import com.yapt.demo.adapter.passport.adapterv2.adapters.*;

/**
 * @author hurui
 * @version Id: PassportForThirdAdapter.java, v 0.1 2020/3/9 14:23 YaphetS Exp $$
 */
public class PassportForThirdAdapter implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {

        return processLogin(openId, LoginForWechatAdapter.class);

    }

    @Override
    public ResultMsg loginForToken(String token) {

        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }


    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}