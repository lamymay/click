package com.arc.click.service.app;

import com.arc.click.model.domain.app.Click;
import com.arc.click.model.request.app.ClickQuery;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.Map;

/**
 * 打卡相关接口定义
 *
 * @author yechao
 * @since 2021/4/2 13:41
 */
public interface ClickService {

    /**
     * 打卡接口,
     * 暂时定:成功后返回 boolean true, 其他为失败
     *
     * @param click 打卡信息
     * @return ResponseEntity
     */
    ResponseEntity<Map<String, Object>> checkIn(Click click);


    /**
     * 删除打卡记录
     * 注意:限制内部使用接口!
     *
     * @param query query
     * @return ResponseEntity
     */
    ResponseEntity<Map<String, Object>> delete(ClickQuery query);

    /**
     * 更新打卡记录
     * 注意:限制内部使用接口!
     *
     * @param model model
     * @return ResponseEntity
     */
    ResponseEntity<Map<String, Object>> update(Click model);


    /**
     * 分页查询打卡记录
     *
     * @param query query
     * @return ResponseEntity
     */
    ResponseEntity<Page<Click>> listPage(ClickQuery query);
}
