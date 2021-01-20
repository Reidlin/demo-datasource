package com.study.aop.multi.datasource.mapper.master;

import com.study.aop.multi.datasource.base.mapper.BaseMapper;
import com.study.aop.multi.datasource.entity.master.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
