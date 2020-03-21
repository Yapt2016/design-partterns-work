package com.yapt.demo.strategy.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hurui
 * @version Id: SubTaskConfigDO.java, v 0.1 2020/3/15 11:48 YaphetS Exp $$
 */
@Data
public class SubTaskConfigDO implements Serializable {

    private String subTaskNo;


    private String subTaskAwardNo;


    private Long subTaskAmt;
}