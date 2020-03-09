package com.yapt.demo.adapter.passport.adapterv2.adapters;

import com.yapt.demo.adapter.passport.ResultMsg;

/**
 * @author hurui
 * @version Id: ILoginAdapter.java, v 0.1 2020/3/9 14:25 YaphetS Exp $$
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
