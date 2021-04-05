package com.arc.click.service.common.impl;

import com.arc.click.dao.common.MockRepository;
import com.arc.click.model.domain.common.Mock;
import com.arc.click.service.common.MockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author may
 * @since 2021/4/5 22:41
 */
@Slf4j
@Service
public class MockServiceImpl implements MockService {

    @Autowired
    private MockRepository mockRepository;

    @Override
    public ResponseEntity save(Mock model) {
        return ResponseEntity.ok(mockRepository.save(model));
    }

    @Override
    public ResponseEntity delete(String key) {
        return null;
    }

    @Override
    public ResponseEntity deleteById(Long id) {
        mockRepository.deleteById(id);
        return ResponseEntity.ok("删除成功!");
    }

    @Override
    public ResponseEntity update(String key, Object data) {
        Optional<Mock> optionalMock = mockRepository.findById(1L);
        Mock mock = optionalMock.get();
        mock.setValue(data.toString());
        return ResponseEntity.ok(mockRepository.save(mock));
    }

    @Override
    public ResponseEntity get(String key) {
        return ResponseEntity.ok(mockRepository.findById(1L));
    }

    @Override
    public ResponseEntity<List<Mock>> list(Map<String, String> query) {
        return ResponseEntity.ok(mockRepository.findAll());
    }
}
