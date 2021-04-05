package com.arc.click.service.rbac;

import com.arc.click.model.domain.app.LoginUser;

/**
 * @author may
 * @since 2021/4/5 22:08
 */
public interface AuthService {

    LoginUser checkUserLogin(String username, String password);
}
