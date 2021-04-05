package com.arc.click.service.app.impl;

import com.arc.click.dao.app.ClickRepository;
import com.arc.click.model.domain.app.Click;
import com.arc.click.model.request.app.ClickQuery;
import com.arc.click.service.app.ClickService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author yechao
 * @since 2021/4/2 14:32
 */
@Slf4j
@Service
public class ClickServiceImpl implements ClickService {

    @Autowired
    private ClickRepository clickRepository;

    @Override
    public ResponseEntity<Map<String, Object>> checkIn(Click click) {
        return ResponseEntity.ok(null);
    }

    @Override
    public ResponseEntity<Map<String, Object>> delete(ClickQuery query) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> update(Click model) {
        return null;
    }

    @Override
    public ResponseEntity<Page<Click>> listPage(ClickQuery query) {
        return null;
    }
}
