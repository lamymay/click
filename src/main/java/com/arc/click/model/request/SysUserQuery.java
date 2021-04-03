package com.arc.click.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.domain.Sort;

import java.util.Date;

/**
 * @author 叶超
 * @since 2019/5/22 18:45
 */
@Setter
@Getter
@ToString
public class SysUserQuery {


    private boolean paged;
    private int pageNumber;
    private int pageSize = 21;
    private long offset;
    private Sort sort;
    private String sortColumn;


    // 自增id
    private Long id;

    // 用户昵称
    private String nickname;

    // 头像
    private String avatar;

    // 账号状态(0：正常 1:暂停)
    private Integer state;

    // 创建时间
    private Date createDate;

    // 更新时间
    private Date updateDate;

    private Long roleId;

    private String roleName;

    private Integer roleState;
}
