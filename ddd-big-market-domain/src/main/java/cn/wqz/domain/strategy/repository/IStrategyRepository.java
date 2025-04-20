package cn.wqz.domain.strategy.repository;

import cn.wqz.domain.strategy.model.entity.StrategyAwardEntity;
import cn.wqz.domain.strategy.model.entity.StrategyEntity;
import cn.wqz.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

/**
 * @Description: TODO
 * @Author qizheng.wang@foxmail.com
 * @Date 2025/4/19 下午7:16
 */
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String strategyId);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);
}
