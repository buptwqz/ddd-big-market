package cn.wqz.domain.strategy.model.entity;

import cn.wqz.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author qizheng.wang@foxmail.com
 * @description:
 * @date 2025/4/20 20:05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyEntity implements Serializable {
    /** 抽奖策略ID */
    private Long strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 抽奖规则模型 */
    private String ruleModels;

    public String[] ruleModels() {
        if (StringUtils.isBlank(ruleModels)) {
            return null;
        }
        return ruleModels.split(Constants.SPLIT);
    }

    public String getRuleWeight() {
        String[] ruleModels = this.ruleModels();
        for (String ruleModel : ruleModels) {
            if ("rule_weight".equals(ruleModel)) {
                return ruleModel;
            }
        }
        return null;
    }
}
