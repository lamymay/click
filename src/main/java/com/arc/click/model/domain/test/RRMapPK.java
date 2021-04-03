package com.arc.click.model.domain.test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 当表中一个无主键、或者主键不能唯一标识一条记录的时候，就需要使用联合主键了，下面是使用JPA注解实现联合主键的代码
 * <p>
 * 1 需要建立一个复合主键类XxxPK.java，用来存放需要生产联合主键的属性，
 * 注意：1该类需要实现序列化，2public无参数的构造方法 3重写equals和hashCode方法。equals方法用于判断两个对象是否相同，EntityManger通过find方法来查找Entity时，是根据equals的返回值来判断的。hashCode方法返回当前对象的哈希码。
 * 2 实体类上夹注解@IdClass({XxxPK}.class)，注释在标注复合主键, 字段上还是需要@Id注解
 *
 * @author 叶超
 * @since 2019/4/30 11:34
 */
@Setter
@Getter
public class RRMapPK implements Serializable {


    private Long roleId;

    private Long resourceId;

}
