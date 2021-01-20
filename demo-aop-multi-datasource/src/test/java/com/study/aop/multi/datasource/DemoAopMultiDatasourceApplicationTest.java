package com.study.aop.multi.datasource;

import com.study.aop.multi.datasource.service.IUserService;
import org.junit.jupiter.api.DisplayName;
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
 * @author DuLing
 * @since 2021/1/20
 */

@SpringBootTest(classes = DemoAopMultiDatasourceApplication.class)
@ExtendWith(SpringExtension.class)
public class DemoAopMultiDatasourceApplicationTest {

    @Autowired
    private IUserService userService;

    @Test
    @DisplayName("测试新增数据")
    public void testInsertUser() {
        userService.addUser();
    }

}
