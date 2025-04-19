package cn.wqz.infrastructure.persistent.dao;

import cn.wqz.infrastructure.persistent.po.StrategyAward;
import cn.wqz.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/4/12 19:55
 * @Description: 抽奖策略奖品明细配置接口
 **/
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);
}
