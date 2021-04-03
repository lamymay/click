package com.arc.click.dao.test;

import com.arc.click.model.domain.test.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository层中为了支持这样的查询
 *
 * @author: yechao
 * @date: 2019/1/10 15:04
 */
public interface RoleRepository extends JpaRepository<Role, Long>/*, JpaSpecificationExecutor<SysUser>*/ {


}
