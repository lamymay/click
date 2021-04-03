package com.arc.click.model.domain.test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 叶超
 * @since 2019/4/30 11:06
 */
@Setter
@Getter
//jpa的save忽略对象中为null的值做更新操作
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private Integer state;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    public Role(String name, int state) {
        this.name = name;
        this.state = state;
    }

    public Role() {
    }
}
