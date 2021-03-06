package com.study.aop.multi.datasource.entity.master;

import com.study.aop.multi.datasource.base.entity.BaseEntity;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author DuLing
 * @since 2021/1/19
 */

@Table(name = "user")
public class User extends BaseEntity implements Serializable {
    private String  username;
    private String  password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
