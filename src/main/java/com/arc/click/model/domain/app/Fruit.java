package com.arc.click.model.domain.app;

import com.arc.click.model.domain.BaseModel;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author yechao
 * @since  2019/1/22 14:52
 */
@Setter@Getter
@Entity
@Table(name = "app_fruit")
public class Fruit extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;// 自增id

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "smell")
    private String smell;

    @Column(name = "weight")
    private String weight;

    @Column(name = "create_date")
    private Date createDate;// 创建时间

    @Column(name = "update_date")
    private Date updateDate;// 更新时间

}
