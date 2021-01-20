package com.study.dynamic.datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.study.dynamic.datasource.entity.User;
import com.study.dynamic.datasource.mapper.UserMapper;
import com.study.dynamic.datasource.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author DuLing
 * @since 2021/1/20
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @DS("master")
    public void addUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("E4B455865F900DBB");
        userMapper.insert(user);
    }

    @Override
    @DS("slave")
    public void addUser2() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("E4B455865F900DBB");
        userMapper.insert(user);
    }
}
