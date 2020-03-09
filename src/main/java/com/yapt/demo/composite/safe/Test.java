package com.yapt.demo.composite.safe;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/8 14:37 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {


        FilePackage f = new FilePackage("D://",1);

        FilePackage f1 = new FilePackage("办公软件",2);
        File ppt = new File("PPT.exe");
        File excel = new File("Excel.exe");

        f1.addChild(ppt);
        f1.addChild(excel);

        FilePackage f2 = new FilePackage("游戏",2);



        FilePackage f3 = new FilePackage("腾讯游戏",3);
        File dnf = new File("DNF.exe");
        f3.addChild(dnf);
        FilePackage f4 = new FilePackage("暴雪游戏",3);
        File war3 = new File("War3.exe");
        f4.addChild(war3);

        f2.addChild(f3);
        f2.addChild(f4);


        f.addChild(f1);
        f.addChild(f2);


        System.out.println("==========================展示当前节点下的所有子节点的关系图==============================");
        f.showAllChild(f);
    }
}