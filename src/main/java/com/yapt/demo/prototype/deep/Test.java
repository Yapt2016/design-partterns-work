package com.yapt.demo.prototype.deep;

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
        dataProtoType.setName("rick");
        List<String> list = new ArrayList<String>();
        list.add("数学");
        list.add("语文");
        dataProtoType.setCourse(list);

        DataDTO dataClone = dataProtoType.jsonClone();
        dataClone.getCourse().add("英语");

        System.out.println("原型对象:"+dataProtoType);

        System.out.println("克隆对象:"+dataClone);

        System.out.println(dataProtoType == dataClone);

        System.out.println(dataProtoType.getCourse() == dataClone.getCourse());

    }
}