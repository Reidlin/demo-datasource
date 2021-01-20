package com.study.dynamic.datasource.entity;

import com.study.dynamic.datasource.commom.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "wallet")
public class Wallet extends BaseEntity implements Serializable {
    private Integer         userId;
    private Integer         status;
    private LocalDateTime   createTime;
    private Integer         amount;
}
