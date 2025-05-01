package cn.wqz.domain.strategy.service.rule;

import cn.wqz.domain.strategy.model.entity.RuleActionEntity;
import cn.wqz.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author qizheng.wang@foxmail.com
 * @description: 抽奖规则过滤接口
 * @date 2025/4/25 18:25
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {
    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);
}
