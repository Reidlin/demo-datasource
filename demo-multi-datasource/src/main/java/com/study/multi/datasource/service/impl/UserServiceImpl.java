package com.study.multi.datasource.service.impl;

import com.study.multi.datasource.entity.master.User;
import com.study.multi.datasource.entity.slave.User2;
import com.study.multi.datasource.mapper.master.UserMapper;
import com.study.multi.datasource.mapper.slave.UserMapper2;
import com.study.multi.datasource.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapper2 userMapper2;

    @Override
    public User getUser(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User2 getUser2(Integer userId) {
        return userMapper2.selectByPrimaryKey(userId);
    }
}
