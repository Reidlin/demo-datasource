package com.study.multi.datasource.datasource.slave;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@MapperScan(basePackages = "com.study.multi.datasource.mapper.slave", sqlSessionTemplateRef = "slaveSqlSessionTemplate")
public class SlaveDatasourceConfig {

    @Bean(name = "slaveDataSource", destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource testDataSource() {
        System.out.println("------------------------slaveDataSource-------------------------------");
        return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
    }

    @Bean(name = "slaveSqlSessionFactory")
    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage("com.study.multi.datasource.entity.slave");
        bean.setVfs(SpringBootVFS.class);
        org.apache.ibatis.session.Configuration ibatisConfig = new org.apache.ibatis.session.Configuration();
        ibatisConfig.setMapUnderscoreToCamelCase(true);
        ibatisConfig.setCacheEnabled(false);
        ibatisConfig.setLazyLoadingEnabled(false);
        ibatisConfig.setLogImpl(org.apache.ibatis.logging.slf4j.Slf4jImpl.class);
        bean.setConfiguration(ibatisConfig);
        return bean.getObject();
    }

    @Bean(name = "slaveTransactionManager")
    public DataSourceTransactionManager slaveTransactionManager(@Qualifier("slaveDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "slaveSqlSessionTemplate")
    public SqlSessionTemplate slaveSqlSessionTemplate(@Qualifier("slaveSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
