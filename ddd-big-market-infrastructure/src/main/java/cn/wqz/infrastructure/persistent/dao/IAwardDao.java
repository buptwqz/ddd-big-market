package cn.wqz.infrastructure.persistent.dao;

import cn.wqz.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/4/12 19:55
 * @Description:
 **/
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();
}
