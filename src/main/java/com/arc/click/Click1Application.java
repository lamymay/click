package com.arc.click;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 打卡应用的主启动类
 *
 * @author yechao
 * @date 2021/04/03
 */
@RestController
@SpringBootApplication
public class Click1Application {

    /**
     * 测试数据源
     */
    @Resource
    private DataSource dataSource;

    /**
     * 测试环境
     *
     * @param request
     * @return
     */
    @GetMapping(value = "info")
    public ResponseEntity dataSource(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }
        map.put("dataSource", dataSource);
        return ResponseEntity.ok(map);
    }

    public static void main(String[] args) {
        SpringApplication.run(Click1Application.class, args);
    }


}
