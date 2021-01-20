package com.study.dynamic.datasource;

import com.study.dynamic.datasource.entity.User;
import com.study.dynamic.datasource.entity.Wallet;
import com.study.dynamic.datasource.service.IDemoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@SpringBootTest(classes = DemoDynamicDatasourceApplication.class)
@ExtendWith(SpringExtension.class)
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.study.dynamic.datasource.mapper")
public class DemoDynamicDatasourceApplicationTest {

    @Autowired
    private IDemoService demoService;

    @Test
    @DisplayName("测试数据新增")
    public void testInsert() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("E4B455865F900DBB");
        demoService.addUser(user);

        Wallet wallet = new Wallet();
        wallet.setStatus(0);
        wallet.setUserId(1);
        wallet.setAmount(100);
        wallet.setCreateTime(LocalDateTime.now());
        demoService.addWallet(wallet);
    }
}
