package com.arc.click.model.domain.app;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 打卡相关的模型
 * 记录打卡者 时间\地点\身份\平台\组织
 *
 * @author yechao
 * @since 2021/4/2 13:43
 */
@Setter
@Getter
@Entity
@Table(name = "app_click")
public class Click implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;// 自增id

    @LastModifiedDate
    @Column(name = "update_time")
    private Date updateTime;// 更新时间

    @CreatedDate
    @Column(name = "create_time")
    private Date createTime;// 创建时间

    @Column(name = "user_id")
    private Long userId;// 用户id

    @Column(name = "check_in_time")
    private LocalDateTime checkInTime;// 打卡时间

    @Column(name = "ip")
    private String ip;//ip地址

    @Column(name = "latitude")
    private Integer latitude;//纬度

    @Column(name = "longitude")
    private Integer longitude;//纬度


    @Column(name = "location")
    private String location;//地点

    @Column(name = "device")
    private String device;//设备

    @Column(name = "organization_id")
    private Integer organizationId;// 组织id


    @Column(name = "attendance_solution")
    private Integer attendanceSolution;//考情方案

//    @Column(name = "avatar")
//    private String avatar;// 头像

    @Column(name = "state")
    private Integer state;// 状态(0：正常 1:暂停)

    @Column(name = "remark")
    private Integer remark;// 状态(0：正常 1:暂停)


}
