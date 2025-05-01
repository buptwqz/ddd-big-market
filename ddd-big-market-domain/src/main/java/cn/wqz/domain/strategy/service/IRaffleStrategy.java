package cn.wqz.domain.strategy.service;

import cn.wqz.domain.strategy.model.entity.RaffleAwardEntity;
import cn.wqz.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * @author qizheng.wang@foxmail.com
 * @description: 抽奖策略接口
 * @date 2025/4/25 18:11
 */
public interface IRaffleStrategy {
    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);
}
