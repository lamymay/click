package com.arc.click.model.domain.app;

import lombok.Data;

/**
 * 用户权限相关模型
 *
 * @author may
 * @since 2021/4/5 22:00
 */
@Data
public class LoginUser {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 是否登录,true=登录成功,false=登录失败
     */
    private boolean login;

    /**
     * 是否认证,true=认证通过,false=认证失败
     */
    private boolean auth;

}
