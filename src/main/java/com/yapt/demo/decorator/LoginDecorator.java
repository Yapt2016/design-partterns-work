package com.yapt.demo.decorator;

import java.util.List;

/**
 * @author hurui
 * @version Id: LoginDecorator.java, v 0.1 2020/3/7 16:17 YaphetS Exp $$
 */
public class LoginDecorator extends OpenCommunityDecorator{


    public LoginDecorator(OpenCommunity openCommunity) {
        super(openCommunity);
    }

    @Override
    public List<String> getDirectory() {
        List<String> list = super.getDirectory();
        list.add("作业");
        list.add("题库");
        list.add("成长墙");
        return list;
    }
}