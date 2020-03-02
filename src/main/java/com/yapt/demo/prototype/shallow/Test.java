package com.yapt.demo.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hurui
 * @version Id: test.java, v 0.1 2020/3/2 20:56 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {

        DataDTO dataProtoType = new DataDTO();
        dataProtoType.setAge(18);
        List<String> list = new ArrayList<String>();
        list.add("数学");
        list.add("语文");
        dataProtoType.setCourse(list);

        DataDTO dataClone = dataProtoType.clone();
        dataClone.getCourse().add("英语");
        dataClone.setName("rick");
        System.out.println("原型对象:"+dataProtoType);

        System.out.println("克隆对象:"+dataClone);

        System.out.println(dataProtoType == dataClone);

        //当克隆的类型为引用类型的时候(非String)，克隆对象里的引用类型的值和原型对象引用类型的值具有相同的内存地址
        System.out.println(dataProtoType.getCourse() == dataClone.getCourse());

        System.out.println(dataProtoType.getName() == dataClone.getName());
    }
}