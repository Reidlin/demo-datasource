package com.study.dynamic.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan(basePackages = {"com.study.dynamic.datasource.mapper"})
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.study.dynamic.datasource.mapper")
public class DemoDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDynamicDatasourceApplication.class, args);
    }
}
