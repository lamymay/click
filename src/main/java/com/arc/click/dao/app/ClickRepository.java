package com.arc.click.dao.app;

import com.arc.click.model.domain.app.Click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 打卡签到相关DAO
 * @author 叶超
 * @date 2021/04/04
 */
public interface ClickRepository extends JpaRepository<Click, Long>, JpaSpecificationExecutor<Click> {


}