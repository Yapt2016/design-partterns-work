package com.yapt.demo.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hurui
 * @version Id: FilePackage.java, v 0.1 2020/3/8 13:58 YaphetS Exp $$
 */
public class FilePackage extends FileComponet {

    List<FileComponet> list;


    private Integer level;

    public FilePackage(String name, Integer level) {
        super(name);
        this.level = level;
        this.list = new ArrayList<FileComponet>();;
    }

    public void addChild(FileComponet fileComponet) {
        list.add(fileComponet);
    }

    public Integer getLevel(FileComponet fileComponet){
      return this.level;
    }



    @Override
    public void showAllChild(FileComponet fileComponet) {
        System.out.println(this.name);

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
            f.showAllChild(fileComponet);
        }
    }

}