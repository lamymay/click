package com.arc.click.model.domain.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author may
 * @since 2021/4/5 22:18
 */
@Setter
@Getter
@Entity
@Table(name = "mock")
public class Mock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;// 自增id

    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;// 创建时间

    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;// 更新时间

    @LastModifiedBy
    @Column(name = "update_user_id")
    private String updateUserId;//更新时候的用户Id

    @Column(name = "active_profile")
    private String activeProfile;//使用的项目环境

    @Column(name = "project_name")
    private String projectName;//项目名称

    @Column(name = "class_name")
    private String className;//类全限定名称

    @Column(name = "field_name")
    private String fieldName;

    @Column(name = "field_type")
    private String fieldType;

    @Column(name = "key")
    private String key;

    @Column(name = "value")
    private String value;

    /**
     * 版本号,一方面在排序时候可以用下,另一方面可以做乐观锁
     */
    @Column(name = "version")
    private String version;


    @Column(name = "reserve",columnDefinition = "json")
    private String reserve;//保留字段JSON

}
