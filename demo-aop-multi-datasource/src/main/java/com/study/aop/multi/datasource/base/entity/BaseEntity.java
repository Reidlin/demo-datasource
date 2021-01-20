package com.study.aop.multi.datasource.base.entity;

import lombok.Getter;
import lombok.Setter;

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

@Getter
@Setter
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer         id;
}
