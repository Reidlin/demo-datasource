package com.study.aop.multi.datasource.datasource;

import java.lang.annotation.*;

/**
 * <p>
 * 多数据源事务注解
 * </p>
 *
 * @author DuLing
 * @since 2021/1/19
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MultiDataSourceTransactional {

    /**
     * 事务管理器数组
     */
    String[] transactionManagers();
}
