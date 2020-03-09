package com.yapt.demo.adapter.passport.adapterv1;

import com.yapt.demo.adapter.passport.PassportService;
import com.yapt.demo.adapter.passport.ResultMsg;

/**
 * @author hurui
 * @version Id: PassportForThirdAdapter.java, v 0.1 2020/3/9 14:21 YaphetS Exp $$
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token,null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone,null);
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}