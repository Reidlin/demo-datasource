package com.study.multi.datasource.entity.slave;

import com.study.multi.datasource.base.entity.BaseEntity;

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
public class User2 extends BaseEntity implements Serializable {
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
