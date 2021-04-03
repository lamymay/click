package com.arc.click.model.domain.app;

import com.arc.click.model.domain.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/10 10:21
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "app_requirement")
public class ProjectRequirement extends BaseModel {

    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 可接受度时间跨度
     */
    @Column(name = "accepted_span")
    private Integer acceptedSpan;

    /**
     * 实际花费
     */
    @Column(name = "actual_input")
    private Long actualInput;

    /**
     * 实际发布时间
     */
    @Column(name = "actual_issue_date")
    private Date actualIssueDate;

    /**
     * 实际上线时间
     */
    @Column(name = "actual_online_date")
    private Date actualOnlineDate;

    /**
     * 实际稳点版本
     */
    @Column(name = "actual_release_date")
    private Date actualReleaseDate;

    /**
     * 实际规模
     */
    @Column(name = "actual_scale")
    private Integer actualScale;

    /**
     * 别名
     */
    @Column(name = "alias")
    private Integer alias;

    /**
     * 应用例子
     */
    @Column(name = "apply_example")
    private String applyExample;

    /**
     * 注释
     */
    @Column(name = "note")
    private String note;


//    @Column(name = "")
//    private String no;

}
