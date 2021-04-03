package com.arc.click.service.test;

import com.arc.click.model.domain.test.SysUser;
import com.arc.click.model.request.SysUserQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/5/22 18:44
 */
public interface UserService {

    SysUser get(Long id);

    Object queryByQuery(SysUser user);

    Page<SysUser> queryPage(SysUser model, Pageable pageable);

    List<SysUser> findByCondition(SysUser user);

    List<SysUser> listByQuery(SysUserQuery user);

    Page<SysUser> pageByQuery(SysUserQuery userQuery, Pageable pageable);
}
