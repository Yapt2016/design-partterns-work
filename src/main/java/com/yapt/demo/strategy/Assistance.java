package com.yapt.demo.strategy;

import com.yapt.demo.strategy.mapper.SubTaskAwardConfigMapper;
import com.yapt.demo.strategy.mapper.SubTaskAwardRecordMapper;
import com.yapt.demo.strategy.model.MsgResult;
import com.yapt.demo.strategy.model.SubTaskAwardConfigDO;
import com.yapt.demo.strategy.model.SubTaskConfigDO;
import lombok.AllArgsConstructor;

/**
 * @author hurui
 * @version Id: Assistance.java, v 0.1 2020/3/15 17:38 YaphetS Exp $$
 */
@AllArgsConstructor
public class Assistance {

    private SubTaskAwardConfigDO awardConfigDO;

    /**
     * 提供统一的助力方法
     * @return
     */
    public MsgResult assistance(){
        MsgResult result = new MsgResult();
        if(awardConfigDO != null){
            double d = Math.random()*(awardConfigDO.getSubTaskMaxAmt()-awardConfigDO.getSubTaskMinAmt()) + awardConfigDO.getSubTaskMinAmt();

            result.setCode("200");
            result.setDesc("助力成功");
            result.setData("助力金额为:￥"+ String.valueOf(d).substring(0,4));
        }else{
            result.setCode("500");
            result.setDesc("助力失败");
            result.setData("助力任务已达成不可继续助力");
        }
        return result;
    }
}