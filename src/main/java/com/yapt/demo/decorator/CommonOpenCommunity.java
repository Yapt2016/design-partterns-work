package com.yapt.demo.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hurui
 * @version Id: CommonOpenCommunity.java, v 0.1 2020/3/7 16:16 YaphetS Exp $$
 */
public class CommonOpenCommunity extends OpenCommunity{


    @Override
    public List<String> getDirectory() {
        List<String> list =new ArrayList<String>();
        list.add("问答");
        list.add("文章");
        list.add("精品课");
        list.add("冒泡");
        list.add("商城");
        return list;
    }
}