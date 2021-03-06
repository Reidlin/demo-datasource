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
 * @author DuLing
 * @since 2021/1/19
 */

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapper2 userMapper2;

    @Override
    @Transactional(rollbackFor = Exception.class, transactionManager = "chainedTransactionManager")
    public void addUser() {
        User user = new User();
        user.setUsername("zs3");
        user.setPassword("E4B455865F900DBB");
        userMapper.insert(user);

        User2 user2 = new User2();
        user2.setUsername("zs3");
        user2.setPassword("E4B455865F900DBB");
        userMapper2.insert(user2);
    }
}
