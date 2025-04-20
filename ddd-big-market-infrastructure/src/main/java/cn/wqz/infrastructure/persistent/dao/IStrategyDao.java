package cn.wqz.infrastructure.persistent.dao;

import cn.wqz.infrastructure.persistent.po.Strategy;
import cn.wqz.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/4/12 19:55
 * @Description: 抽奖策略接口
 **/
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
