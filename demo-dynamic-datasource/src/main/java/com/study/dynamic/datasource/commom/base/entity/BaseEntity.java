package com.study.dynamic.datasource.commom.base.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author DuLing
 * @since 2021/1/19
 */

public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer         id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
