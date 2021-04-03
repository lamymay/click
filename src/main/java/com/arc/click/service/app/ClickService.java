package com.arc.click.service.app;

import com.arc.click.model.domain.app.Click;

import java.util.Map;

/**
 * 打卡相关接口定义
 *
 * @author yechao
 * @since 2021/4/2 13:41
 */
public interface ClickService {

    /**
     * 打卡签到接口,
     * 暂时定:成功后返回 boolean true, 其他为失败
     *
     * @param click 打卡信息
     * @return map
     */
    Map<String, Object> checkIn(Click click);
}
