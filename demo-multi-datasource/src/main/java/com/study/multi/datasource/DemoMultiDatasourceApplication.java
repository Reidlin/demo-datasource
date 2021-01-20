package com.study.multi.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.study.multi.datasource.mapper")
public class DemoMultiDatasourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoMultiDatasourceApplication.class, args);
    }
}
