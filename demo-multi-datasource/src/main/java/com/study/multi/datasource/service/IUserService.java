package com.study.multi.datasource.service;


import com.study.multi.datasource.entity.master.User;
import com.study.multi.datasource.entity.slave.User2;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */
public interface IUserService {

    User getUser(Integer userId);

    User2 getUser2(Integer userId);
}
