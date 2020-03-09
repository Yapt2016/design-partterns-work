package com.yapt.demo.decorator;

import java.util.List;

/**
 * @author hurui
 * @version Id: OpenCommunityDecorator.java, v 0.1 2020/3/7 16:17 YaphetS Exp $$
 */
public  class OpenCommunityDecorator extends OpenCommunity{

    private OpenCommunity openCommunity;

    public OpenCommunityDecorator(OpenCommunity openCommunity){
        this.openCommunity = openCommunity;
    }

    @Override
    public List<String> getDirectory() {
        return this.openCommunity.getDirectory();
    }
}