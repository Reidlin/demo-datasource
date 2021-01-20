package com.study.aop.multi.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * <p>
 *
 * </p>
 *
 * @author DuLing
 * @since 2021/1/20
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.study.aop.multi.datasource.mapper")
public class DemoAopMultiDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAopMultiDatasourceApplication.class, args);
    }

}
