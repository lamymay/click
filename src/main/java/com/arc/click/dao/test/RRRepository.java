package com.arc.click.repository.tedst;

import com.arc.click.model.domain.test.RR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repository层中为了支持这样的查询，
 * RRRepository 需要继承JpaRepository（基本查询），
 * JpaSpecificationExecutor（分页），这个接口是不需要再去实现的，到了Repository层就行，再对此进行扩充（比Mybatis简单多了）。
 *
 * @author: yechao
 * @date: 2019/1/10 15:04
 */
public interface RRRepository extends JpaRepository<RR, Long>/*, JpaSpecificationExecutor<SysUser>*/ {
    RR findByRoleId(Long roleId);

    @Query(value = "SELECT rr.* FROM   rr AS rr LEFT JOIN role AS r ON r.id=rr.role_id where  rr.role_id=?1",nativeQuery = true)
    List<RR> listByRoleId(Long roleId);
}
