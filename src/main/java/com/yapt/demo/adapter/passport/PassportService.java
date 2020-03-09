package com.yapt.demo.adapter.passport;

/**
 * @author hurui
 * @version Id: PassportService.java, v 0.1 2020/3/9 14:19 YaphetS Exp $$
 */
public class PassportService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}