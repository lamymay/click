package com.arc.click.model.domain.test;

import lombok.*;

import javax.persistence.*;

/**
 * 无主键的表
 * 两个属性可确定一条唯一数据，这里用联合主键
 *
 * @author 叶超
 * @since 2019/4/30 9:43
 */
@Setter
@Getter
@IdClass(RRMapPK.class)
@Entity
@Table(name = "rr")
public class RR {

    @Id
    @Column(name = "role_id")
    Long roleId;


    @Column(name = "resource_id")
    Long resourceId;
}
