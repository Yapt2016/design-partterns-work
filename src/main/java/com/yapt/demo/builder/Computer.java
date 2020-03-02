package com.yapt.demo.builder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hurui
 * @version Id: Computer.java, v 0.1 2020/3/2 21:45 YaphetS Exp $$
 */
@Data
public class Computer {

    private String zhuBan;

    private String xianKa;

    private String chuLiQi;

    private String neiCun;

    @Override
    public String toString() {
        return "Computer{" +
                "该主机的配置为: 主板:'" + zhuBan + '\'' +
                ", 显卡:" + xianKa + '\'' +
                ", 处理器:" + chuLiQi + '\'' +
                ", 内存:" + neiCun + '\'' +
                '}';
    }
}