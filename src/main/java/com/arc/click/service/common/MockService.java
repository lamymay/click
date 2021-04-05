package com.arc.click.service.common;

import com.arc.click.model.domain.common.Mock;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

/**
 * 控制变量用的服务
 *
 * @author may
 * @since 2021/4/5 22:12
 */
public interface MockService {
    /**
     * 插入记录
     *
     * @param model 模型
     * @return ResponseEntity
     */
    ResponseEntity save(Mock model);


    /**
     * 删除数据
     *
     * @param key 数据的key
     * @return ResponseEntity
     */
    ResponseEntity delete(String key);

    /**
     * 删除数据
     *
     * @param id id
     * @return ResponseEntity
     */
    ResponseEntity deleteById(Long id);

    /**
     * 更新数据
     *
     * @param key  数据的key
     * @param data 数据
     * @return ResponseEntity
     */
    ResponseEntity update(String key, Object data);

    /**
     * 查数据
     *
     * @param key 数据的key
     * @return ResponseEntity
     */
    ResponseEntity get(String key);

    /**
     * 查列表
     *
     * @param query 分页参数
     * @return
     */
    ResponseEntity<List<Mock>> list(Map<String, String> query);


}
