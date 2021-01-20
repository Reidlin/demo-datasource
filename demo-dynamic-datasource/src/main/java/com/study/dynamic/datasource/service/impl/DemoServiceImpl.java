package com.study.dynamic.datasource.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.study.dynamic.datasource.entity.User;
import com.study.dynamic.datasource.entity.Wallet;
import com.study.dynamic.datasource.mapper.UserMapper;
import com.study.dynamic.datasource.mapper.WalletMapper;
import com.study.dynamic.datasource.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@Service
public class DemoServiceImpl implements IDemoService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private WalletMapper walletMapper;

    @Override
    @DS("master")
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    @DS("slave")
    public void addWallet(Wallet wallet) {
        walletMapper.insert(wallet);
    }
}
