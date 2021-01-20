package com.study.dynamic.datasource.entity;

import com.study.dynamic.datasource.commom.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/18
 */

@Getter
@Setter
@Table(name = "user")
public class User extends BaseEntity implements Serializable {
    private String  username;
    private String  password;
}
