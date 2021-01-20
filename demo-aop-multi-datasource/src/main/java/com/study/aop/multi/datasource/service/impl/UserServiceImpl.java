package com.study.aop.multi.datasource.service.impl;

import com.study.aop.multi.datasource.entity.master.User;
import com.study.aop.multi.datasource.entity.slave.User2;
import com.study.aop.multi.datasource.mapper.master.UserMapper;
import com.study.aop.multi.datasource.mapper.slave.UserMapper2;
import com.study.aop.multi.datasource.service.IUserService;
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
    @Transactional(rollbackFor = Exception.class)
    public void addUser() {
        User user = new User();
        user.setUsername("wangw");
        user.setPassword("E4B455865F900DBB");
        userMapper.insert(user);

        User2 user2 = new User2();
        user2.setUsername("wangw");
        user2.setPassword("E4B455865F900DBB");
        userMapper2.insert(user2);
    }
}
