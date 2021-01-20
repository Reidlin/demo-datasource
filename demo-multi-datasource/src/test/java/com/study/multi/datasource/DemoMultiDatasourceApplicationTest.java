package com.study.multi.datasource;

import com.study.multi.datasource.entity.master.User;
import com.study.multi.datasource.entity.slave.User2;
import com.study.multi.datasource.mapper.master.UserMapper;
import com.study.multi.datasource.mapper.slave.UserMapper2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@SpringBootTest(classes = DemoMultiDatasourceApplication.class)
@ExtendWith(SpringExtension.class)
public class DemoMultiDatasourceApplicationTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapper2 userMapper2;

    @Test
    public void testFind() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getUsername());

        User2 user2 = userMapper2.selectByPrimaryKey(1);
        System.out.println(user2.getUsername());
    }
}
