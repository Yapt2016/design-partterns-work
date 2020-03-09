package com.yapt.demo.composite.safe;

/**
 * @author hurui
 * @version Id: File.java, v 0.1 2020/3/8 13:58 YaphetS Exp $$
 */
public class File extends FileComponet {

    public File(String name) {
        super(name);
    }

    @Override
    public void showAllChild(FileComponet fileComponet) {
        System.out.println(this.name);
    }
}