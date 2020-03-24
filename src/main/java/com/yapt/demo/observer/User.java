package com.yapt.demo.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hurui
 * @version Id: User.java, v 0.1 2020/3/24 18:52 YaphetS Exp $$
 */
@Data
@AllArgsConstructor
public class User implements Serializable {

    /**
     * 姓名
     */
    private String name;

    /**
     * 问题
     */
    private String question;
}