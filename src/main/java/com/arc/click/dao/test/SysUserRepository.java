package com.arc.click.dao.test;

import com.arc.click.model.domain.test.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * repository
 * Repository层中为了支持这样的查询，
 * sysUserRepository需要继承JpaRepository（基本查询），
 * JpaSpecificationExecutor（分页），这个接口是不需要再去实现的，到了Repository层就行，再对此进行扩充（比Mybatis简单多了）。
 *
 * @author: yechao
 * @date: 2019/1/10 15:04
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {
//public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    /**
     * 双in 查询测试
     *
     * @param ids
     * @param avatars
     * @return
     */
    List<SysUser> findAllByIdInAndAvatarIn(@Param("id") List<Long> ids, @Param("avatar") List<String> avatars);

    List<SysUser> findAllByIdIn(@Param("id") List<Long> ids);

    /**
     * 测试多条件查询  包含in 和 普条字段
     *
     * @param ids
     * @param avatars
     * @param state
     * @return
     */
    List<SysUser> findAllByIdInAndAndAvatarInAndState(@Param("id") List<Long> ids, @Param("avatar") List<String> avatars, @Param("state") Integer state);

//    Page<SysUser> findAll(Specification<SysUser> example, Pageable pageable);

//    Object findAll(Specification<SysUser> example, Pageable pageable);

//    List<SysUser> findAll(Specification querySpecifi);

//    List<SysUser> findAll(Specification<SysUser> specifications, Sort sort);
}
