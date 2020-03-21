package com.yapt.demo.strategy.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hurui
 * @version Id: SubTaskAwardConfigDO.java, v 0.1 2020/3/15 11:48 YaphetS Exp $$
 */
@Data
public class SubTaskAwardConfigDO implements Serializable {

    private String subTaskAwardNo;

    private double subTaskMaxAmt;

    private double subTaskMinAmt;
}