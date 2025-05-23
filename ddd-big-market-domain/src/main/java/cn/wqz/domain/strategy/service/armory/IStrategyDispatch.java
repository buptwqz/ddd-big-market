package cn.wqz.domain.strategy.service.armory;

/**
 * @author qizheng.wang@foxmail.com
 * @description: 策略抽奖调度
 * @date 2025/4/20 19:55
 */
public interface IStrategyDispatch {
    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
