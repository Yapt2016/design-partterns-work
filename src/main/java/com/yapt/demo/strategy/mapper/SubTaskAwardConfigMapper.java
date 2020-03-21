package com.yapt.demo.strategy.mapper;

import com.yapt.demo.strategy.model.SubTaskAwardConfigDO;
import net.sf.cglib.core.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author hurui
 * @version Id: SubTaskAwardMapper.java, v 0.1 2020/3/15 11:54 YaphetS Exp $$
 */
public class SubTaskAwardConfigMapper {




   public static SubTaskAwardConfigDO queryBySubTaskAwardNo(final String subTaskAwardNo){
        SubTaskAwardConfigDO configDO1 = new SubTaskAwardConfigDO();
        configDO1.setSubTaskAwardNo("123");
        configDO1.setSubTaskMaxAmt(2);
        configDO1.setSubTaskMinAmt(1);


        SubTaskAwardConfigDO configDO2 = new SubTaskAwardConfigDO();
        configDO2.setSubTaskAwardNo("234");
        configDO2.setSubTaskMaxAmt(1.5);
        configDO2.setSubTaskMinAmt(0.8);


        SubTaskAwardConfigDO configDO3 = new SubTaskAwardConfigDO();
        configDO3.setSubTaskAwardNo("345");
        configDO3.setSubTaskMaxAmt(1);
        configDO3.setSubTaskMinAmt(0.5);


        SubTaskAwardConfigDO configDO4 = new SubTaskAwardConfigDO();
        configDO4.setSubTaskAwardNo("456");
        configDO4.setSubTaskMaxAmt(0.5);
        configDO4.setSubTaskMinAmt(0.1);

        if(configDO1.getSubTaskAwardNo().equals(subTaskAwardNo)){
            return configDO1;
        }else if(configDO2.getSubTaskAwardNo().equals(subTaskAwardNo)){
            return configDO2;
        }else if(configDO3.getSubTaskAwardNo().equals(subTaskAwardNo)) {
            return configDO2;
        }else if(configDO4.getSubTaskAwardNo().equals(subTaskAwardNo)) {
            return configDO2;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        SubTaskAwardConfigDO configDO = queryBySubTaskAwardNo("345");
        System.out.println(configDO);
    }
}