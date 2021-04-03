package com.arc.click.dao.test;

import com.arc.click.model.domain.app.ProjectRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author yechao
 * @date 2019/1/10 15:04
 */
public interface ProjectRequirementRepository extends JpaRepository<ProjectRequirement, Long> {

    /**
     * 应用例子
     */
    @Query(value = "SELECT * FROM `t_project_requirement` WHERE apply_example=?1  AND  note =?2", nativeQuery = true)
    ProjectRequirement getByApplyExampleAndNote(String applyExample, String note);

    /**
     * 别名查询
     *
     * @return
     */
    @Query(value = "SELECT * FROM `t_project_requirement` WHERE alias=:alias ", nativeQuery = true)
    ProjectRequirement getByTestAlias(@Param("alias") String alias);
}
