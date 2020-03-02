package com.yapt.demo.prototype.deep;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author hurui
 * @version Id: DataDTO.java, v 0.1 2020/3/2 20:26 YaphetS Exp $$
 */
@Data
public class DataDTO implements Cloneable,Serializable{

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

    /**
     * 反序列化克隆
     * @return
     */
    public DataDTO serializableClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DataDTO) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * JSON克隆
     * @return
     */
    public DataDTO jsonClone(){
        return JSON.parseObject(JSON.toJSONString(this),DataDTO.class);
    }
}