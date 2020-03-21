package com.yapt.demo.strategy;

import com.yapt.demo.strategy.mapper.SubTaskAwardConfigMapper;
import com.yapt.demo.strategy.mapper.SubTaskAwardRecordMapper;
import com.yapt.demo.strategy.mapper.SubTaskConfigMapper;
import com.yapt.demo.strategy.model.SubTaskAwardConfigDO;
import com.yapt.demo.strategy.model.SubTaskConfigDO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hurui
 * @version Id: AssistanceStrategy.java, v 0.1 2020/3/15 17:51 YaphetS Exp $$
 */
public class AssistanceStrategy {

    public Assistance getStrategy(String subTakNo){
        //获取当前任务助力的累计金额
        Long totalAmt = SubTaskAwardRecordMapper.queryTotalAmt(subTakNo);
        //根据金额判匹配助力阶段任务
        SubTaskConfigDO configDO = checkSubTaskStatus(totalAmt);
        if(configDO != null){
            //根据阶段任务查询对应的助力金额配置
            SubTaskAwardConfigDO awardConfigDO = SubTaskAwardConfigMapper.queryBySubTaskAwardNo(configDO.getSubTaskAwardNo());
            return new Assistance(awardConfigDO);
        }
        return null;
    }


    private static SubTaskConfigDO checkSubTaskStatus(Long totalAmt){
        SubTaskConfigDO subTaskConfigDO = null;
        List<SubTaskConfigDO> list = SubTaskConfigMapper.queryAllSubTaskConfig();
        List<Long> amtList = list.stream().map(SubTaskConfigDO::getSubTaskAmt).collect(Collectors.toList());
        for (int i = 0; i < amtList.size(); i++) {
            if (amtList.get(i).compareTo(totalAmt) >= 0) {
                subTaskConfigDO = list.get(i);
                break;
            }
        }
        return subTaskConfigDO;
    }



}