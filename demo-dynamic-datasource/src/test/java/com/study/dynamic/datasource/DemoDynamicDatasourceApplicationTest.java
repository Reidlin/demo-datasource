package com.study.dynamic.datasource;

import com.study.dynamic.datasource.service.IUserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * <p>
 * 单元测试
 * </p>
 *
 * @author DuLing
 * @since 2021/1/19
 */

@SpringBootTest(classes = DemoDynamicDatasourceApplication.class)
@ExtendWith(SpringExtension.class)
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.study.dynamic.datasource.mapper")
public class DemoDynamicDatasourceApplicationTest {

    @Autowired
    private IUserService userService;

    @Test
    @DisplayName("测试数据新增")
    public void testInsertUser() {
        userService.addUser();
        userService.addUser2();
    }
}
