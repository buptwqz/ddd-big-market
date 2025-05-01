package cn.wqz.domain.strategy.model.entity;

import cn.wqz.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import lombok.*;

/**
 * @author qizheng.wang@foxmail.com
 * @description:
 * @date 2025/4/25 21:33
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity<T extends RuleActionEntity.RaffleEntity> {
    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();

    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();

    private String ruleModel;

    private T data;


    static public class RaffleEntity {

    }
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public class RaffleBeforeEntity extends RaffleEntity {
        private Long strategyId;

        private String ruleWeightValueKey;

        private Integer awardId;
    }
    static public class RaffleCenterEntity extends RaffleEntity {

    }
    static public class RaffleAfterEntity extends RaffleEntity {

    }
}