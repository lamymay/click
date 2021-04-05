package com.arc.click.service.common;

import org.springframework.http.ResponseEntity;

/**
 * 控制变量用的服务
 *
 * @author may
 * @since 2021/4/5 22:12
 */
public interface MockService {

    /**
     * 查数据
     *
     * @param key 数据的key
     * @return json
     */
    ResponseEntity get(String key);

    /**
     * 查列表
     * @param key
     * @return
     */
    ResponseEntity list();

    /**
     * 更新数据
     *
     * @param key  数据的key
     * @param data 数据
     * @return json
     */
    ResponseEntity update(String key, Object data);


    /**
     * 删除数据
     * @param key 数据的key
     * @return json
     */
    ResponseEntity delete(String key);


}
