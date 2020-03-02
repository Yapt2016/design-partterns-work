package com.yapt.demo.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * @author hurui
 * @version Id: DataDTO.java, v 0.1 2020/3/2 20:26 YaphetS Exp $$
 */
@Data
public class DataDTO implements Cloneable{

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 课程
     */
    private List<String> course;

    @Override
    public DataDTO clone(){
        try {
            return (DataDTO) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


}