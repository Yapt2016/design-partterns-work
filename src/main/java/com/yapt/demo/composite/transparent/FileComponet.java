package com.yapt.demo.composite.transparent;

/**
 * @author hurui
 * @version Id: FileComponet.java, v 0.1 2020/3/8 13:55 YaphetS Exp $$
 */
public abstract class FileComponet {

    public void addChild(FileComponet fileComponet){
        throw new UnsupportedOperationException("不允许添加文件");
    }

    public void showName(FileComponet fileComponet){
        throw new UnsupportedOperationException("不允许展示名称");
    }

    public Integer getLevel(FileComponet fileComponet){
        throw new UnsupportedOperationException("不允许获取子节点的level");
    }

    public void showChild(FileComponet fileComponet){
        throw new UnsupportedOperationException("不允许展示子节点");
    }

    public void showAllChild(FileComponet fileComponet){
        throw new UnsupportedOperationException("不允许展示所有子节点");
    }
}