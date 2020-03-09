package com.yapt.demo.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hurui
 * @version Id: FilePackage.java, v 0.1 2020/3/8 13:58 YaphetS Exp $$
 */
public class FilePackage extends  FileComponet{

    List<FileComponet> list = new ArrayList<FileComponet>();

    private String name;

    private Integer level;

    public FilePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(FileComponet fileComponet) {
        if(fileComponet instanceof FilePackage && fileComponet.getLevel(fileComponet)<this.level){
            throw new UnsupportedOperationException("不允许添加的子节点level比当前的子节点小");
        }else{
            list.add(fileComponet);
        }
    }

    @Override
    public Integer getLevel(FileComponet fileComponet){
      return this.level;
    }

    @Override
    public void showName(FileComponet fileComponet) {
        System.out.println(this.name);
    }

    @Override
    public void showChild(FileComponet fileComponet) {
        showName(fileComponet);
        for(FileComponet f : list){
            if(this.level != null){
                for(int i = 0;i<this.level;i++){
                    System.out.print("    ");
                }
                for(int i = 0;i<this.level;i++){
                    if(i==0){
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            if(f instanceof FilePackage){
                f.showName(fileComponet);
            }else if(f instanceof File){
                f.showName(f);
            }

        }
    }


    @Override
    public void showAllChild(FileComponet fileComponet) {

        showName(fileComponet);
        for(FileComponet f : list){
            if(this.level != null){
                for(int i = 0;i<this.level;i++){
                    System.out.print("    ");
                }
                for(int i = 0;i<this.level;i++){
                    if(i==0){
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            if(f instanceof FilePackage){
                f.showAllChild(fileComponet);
            }else if(f instanceof File){
                f.showName(f);
            }

        }
    }

}