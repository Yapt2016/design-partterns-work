package com.yapt.demo.strategy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hurui
 * @version Id: MsgResult.java, v 0.1 2020/3/15 17:43 YaphetS Exp $$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MsgResult {
    private String code;

    private String desc;

    private String data;

}