package com.yapt.demo.adapter.passport.adapterv2.adapters;

import com.yapt.demo.adapter.passport.PassportService;
import com.yapt.demo.adapter.passport.ResultMsg;

/**
 * @author hurui
 * @version Id: AbstraceAdapter.java, v 0.1 2020/3/9 14:24 YaphetS Exp $$
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
