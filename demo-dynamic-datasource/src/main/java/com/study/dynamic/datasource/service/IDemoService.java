package com.study.dynamic.datasource.service;

import com.study.dynamic.datasource.entity.User;
import com.study.dynamic.datasource.entity.Wallet;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */
public interface IDemoService {

    void addUser(User user);

    void addWallet(Wallet wallet);
}
