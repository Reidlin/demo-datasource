package com.study.aop.multi.datasource.datasource.master;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.mapper.autoconfigure.SpringBootVFS;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@Configuration
@MapperScan(basePackages = "com.study.aop.multi.datasource.mapper.master", sqlSessionTemplateRef = "masterSqlSessionTemplate")
public class MasterDatasourceConfig {

    @Bean(name = "masterDataSource", destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource.master")
    @Primary
    public DataSource masterDataSource() {
        System.out.println("------------------------masterDataSource-------------------------------");
        return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
    }

    @Bean(name = "masterSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("masterDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.study.aop.multi.datasource.entity.master");
        bean.setVfs(SpringBootVFS.class);
        org.apache.ibatis.session.Configuration ibatisConfig = new org.apache.ibatis.session.Configuration();
        ibatisConfig.setMapUnderscoreToCamelCase(true);
        ibatisConfig.setCacheEnabled(false);
        ibatisConfig.setLazyLoadingEnabled(false);
        ibatisConfig.setLogImpl(org.apache.ibatis.logging.slf4j.Slf4jImpl.class);
        bean.setConfiguration(ibatisConfig);
        return bean.getObject();
    }

    @Bean(name = "masterTransactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager(@Qualifier("masterDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "masterSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate masterSqlSessionTemplate(@Qualifier("masterSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
