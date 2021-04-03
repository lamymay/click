package com.arc.click.service.demo;

import com.arc.click.model.domain.demo.DemoModel;

/**
 * @author yechao
 * @since 2021/4/1 10:42
 */
public interface DemoService {

    DemoModel save(DemoModel model);
    Object update(DemoModel model);
    DemoModel get(Long id);
    DemoModel delete(Long id);

}
