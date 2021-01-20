package com.study.dynamic.datasource.commom.base.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author LeiDuLin
 * @since 2021/1/19
 */

@Getter
@Setter
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer         id;
}
