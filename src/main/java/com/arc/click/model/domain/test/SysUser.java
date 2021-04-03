package com.arc.click.model.domain.test;

import com.arc.click.model.domain.BaseModel;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/22 14:52
 */
@Setter
@Getter
@Entity
@Table(name = "sys_user")
public class SysUser extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;// 自增id

    @Column(name = "nickname")
    private String nickname;// 用户昵称

    @Column(name = "avatar")
    private String avatar;// 头像

    @Column(name = "state")
    private Integer state;// 账号状态(0：正常 1:暂停)

    @Column(name = "create_date")
    private Date createDate;// 创建时间

    @Column(name = "update_date")
    private Date updateDate;// 更新时间

}
