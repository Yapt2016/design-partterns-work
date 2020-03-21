package com.yapt.demo.strategy.mapper;

import com.yapt.demo.strategy.model.SubTaskConfigDO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hurui
 * @version Id: SubTaskMapper.java, v 0.1 2020/3/15 11:53 YaphetS Exp $$
 */
public class SubTaskConfigMapper {

    public static List<SubTaskConfigDO> queryAllSubTaskConfig(){
        List<SubTaskConfigDO> list  = new ArrayList<>();
        SubTaskConfigDO configDO1 = new SubTaskConfigDO();
        configDO1.setSubTaskNo("qaz");
        configDO1.setSubTaskAwardNo("123");
        configDO1.setSubTaskAmt(20L);
        list.add(configDO1);
        SubTaskConfigDO configDO2 = new SubTaskConfigDO();
        configDO2.setSubTaskNo("wsx");
        configDO2.setSubTaskAwardNo("234");
        configDO2.setSubTaskAmt(50L);
        list.add(configDO2);
        SubTaskConfigDO configDO3 = new SubTaskConfigDO();
        configDO3.setSubTaskNo("edc");
        configDO3.setSubTaskAwardNo("345");
        configDO3.setSubTaskAmt(80L);
        list.add(configDO3);
        SubTaskConfigDO configDO4 = new SubTaskConfigDO();
        configDO4.setSubTaskNo("rfv");
        configDO4.setSubTaskAwardNo("456");
        configDO4.setSubTaskAmt(100L);
        list.add(configDO4);
        return list;
    }

    public static void main(String[] args) {
        List<SubTaskConfigDO> list = queryAllSubTaskConfig();
        System.out.println(list);
    }

}