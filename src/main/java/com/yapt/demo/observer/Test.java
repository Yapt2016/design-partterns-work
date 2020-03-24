package com.yapt.demo.observer;

import com.google.common.eventbus.EventBus;

/**
 * @author hurui
 * @version Id: Test.java, v 0.1 2020/3/24 18:49 YaphetS Exp $$
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher("Tom");
        eventBus.register(teacher);
        User user = new User("Yapt","如何优雅的使用设计模式?");
        eventBus.post(user);
    }
}