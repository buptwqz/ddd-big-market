package cn.wqz.test.infrastructure;

import cn.wqz.infrastructure.persistent.dao.IAwardDao;
import cn.wqz.infrastructure.persistent.po.Award;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/4/12 20:34
 * @Description: 奖品持久化单元测试
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {
    @Resource
    private IAwardDao awardDao;

    @Test
    public void testQueryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果: {}", JSON.toJSONString(awards));
    }
}
