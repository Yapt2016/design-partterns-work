package com.yapt.demo.observer;

import com.google.common.eventbus.Subscribe;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hurui
 * @version Id: Teacher.java, v 0.1 2020/3/24 18:54 YaphetS Exp $$
 */
@Data
@AllArgsConstructor
public class Teacher implements Serializable {

    private String name;

    @Subscribe
    public void observer(User user){

        System.out.println("用户"+user.getName()+"在咕泡社区提了一个问题"+"\n"
                +this.name + "老师,您收到一个来自"+user.getName()+"提的问题！"+"\n"
                +"问题是:" + user.getQuestion() + "\n");
    }
}