package com.arc.click.service.rbac.impl;

import com.arc.click.model.domain.app.LoginUser;
import com.arc.click.service.rbac.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author may
 * @since 2021/4/5 22:09
 */
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    public LoginUser checkUserLogin(String username, String password) {
        LoginUser loginUser = new LoginUser();
        return loginUser;
    }
}
