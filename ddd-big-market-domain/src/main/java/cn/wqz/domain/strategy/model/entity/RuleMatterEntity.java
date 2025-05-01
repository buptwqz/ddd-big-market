package cn.wqz.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qizheng.wang@foxmail.com
 * @description:
 * @date 2025/4/25 21:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleMatterEntity {
    private String userId;
    private Long strategyId;
    private Integer awardId;
    private String ruleModel;
}
