package com.yapt.demo.composite.transparent;

/**
 * @author hurui
 * @version Id: File.java, v 0.1 2020/3/8 13:58 YaphetS Exp $$
 */
public class File extends  FileComponet{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showName(FileComponet fileComponet) {
        System.out.println(this.name);
    }
}