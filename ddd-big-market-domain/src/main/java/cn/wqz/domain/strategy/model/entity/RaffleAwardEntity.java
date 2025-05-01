package cn.wqz.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qizheng.wang@foxmail.com
 * @description: 抽奖奖品
 * @date 2025/4/25 18:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleAwardEntity {

    private Long strategyId;
    private Integer awardId;
    private String awardKey;
    private String awardConfig;
    private String awardDesc;

}
