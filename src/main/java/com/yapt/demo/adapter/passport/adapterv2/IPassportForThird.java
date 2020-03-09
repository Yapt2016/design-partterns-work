package com.yapt.demo.adapter.passport.adapterv2;

import com.yapt.demo.adapter.passport.ResultMsg;

/**
 * @author hurui
 * @version Id: IPassportForThird.java, v 0.1 2020/3/9 14:23 YaphetS Exp $$
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
