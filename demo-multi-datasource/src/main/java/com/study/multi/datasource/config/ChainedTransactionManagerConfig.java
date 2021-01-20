package com.study.multi.datasource.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * <p>
 * 链式事务配置
 * </p>
 *
 * @author DuLing
 * @since 2021/1/20
 */

@Configuration
public class ChainedTransactionManagerConfig {

    /**
     * 链式事务Bean
     */
    @Bean(name = "chainedTransactionManager")
    public ChainedTransactionManager chainedTransactionManager(PlatformTransactionManager platformTransactionManager,
                                                               @Qualifier("slaveTransactionManager") PlatformTransactionManager slaveTransactionManager) {
        return new ChainedTransactionManager(platformTransactionManager, slaveTransactionManager);
    }
}
