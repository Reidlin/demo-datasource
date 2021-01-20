package com.study.multi.datasource.entity.master;

import com.study.multi.datasource.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

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
@Getter
@Setter
@Table(name = "user")
public class User extends BaseEntity implements Serializable {
    private String  username;
    private String  password;
}
