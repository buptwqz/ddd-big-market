package cn.wqz.domain.strategy.service.armory;

/**
 * @author qizheng.wang@foxmail.com
 * @description: TODO
 * @date 2025/4/19 19:18
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategy(Long strategyId);

    Integer getRandomAwardId(Long strategyId);

}

