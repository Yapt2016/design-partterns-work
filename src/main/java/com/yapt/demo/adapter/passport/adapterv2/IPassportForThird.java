package com.yapt.demo.adapter.passport.adapterv2;

import com.yapt.demo.adapter.passport.ResultMsg;
import com.yapt.demo.adapter.passport.adapterv2.adapters.ILoginAdapter;

/**
 * @author hurui
 * @version Id: IPassportForThird.java, v 0.1 2020/3/9 14:23 YaphetS Exp $$
 */
public interface IPassportForThird {

    ResultMsg login(String openId,Class<? extends ILoginAdapter> clazz);

}
