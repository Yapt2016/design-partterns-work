package com.yapt.demo.adapter.passport.adapterv2;

import com.yapt.demo.adapter.passport.ResultMsg;
import com.yapt.demo.adapter.passport.adapterv2.adapters.*;

/**
 * @author hurui
 * @version Id: PassportForThirdAdapter.java, v 0.1 2020/3/9 14:23 YaphetS Exp $$
 */
public class PassportForThirdAdapter implements IPassportForThird {

    @Override
    public ResultMsg login(String id, Class<? extends ILoginAdapter> clazz){
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