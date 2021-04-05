package com.arc.click.dao.common;

import com.arc.click.model.domain.common.Mock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * mock相关DAO
 *
 * @author 叶超
 * @date 2021/04/04
 */
public interface MockRepository extends JpaRepository<Mock, Long>, JpaSpecificationExecutor<Mock> {


}