package cn.wqz.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/4/12 下午3:41
 * @GitHub: https://github.com/buptwqz
 * @Description: 抽奖策略
 **/
@Data
public class Strategy {
    /** 自增ID */
    private Long id;
    /** 抽奖策略ID */
    private Long strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
}
