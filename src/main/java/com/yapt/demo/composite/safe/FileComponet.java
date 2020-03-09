package com.yapt.demo.composite.safe;

/**
 * @author hurui
 * @version Id: FileComponet.java, v 0.1 2020/3/8 13:55 YaphetS Exp $$
 */
public abstract class FileComponet {
    protected String name;

    public FileComponet(String name) {
        this.name = name;
    }

    public abstract void showAllChild(FileComponet fileComponet);
}