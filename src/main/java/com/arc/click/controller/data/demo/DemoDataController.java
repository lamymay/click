package com.arc.click.controller.data.demo;

import com.arc.click.model.domain.demo.DemoModel;
import com.arc.click.service.demo.DemoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yechao
 * @date 2021/04/01 10:27 上午
 */
@RequestMapping("/test/demo")
@RestController
public class DemoDataController {

    /**
     * 测试用
     */
    @Resource
    private DemoService demoService;

    @PostMapping(value = "")
    public ResponseEntity save(@RequestBody DemoModel model) {
        return ResponseEntity.ok(demoService.save(model));
    }

    @GetMapping(value = "{id}")
    public ResponseEntity get(@PathVariable Long id) {
        return ResponseEntity.ok(demoService.get(id));
    }


//    @PostMapping(value = "/query")
//    public ResponseEntity list() {
//        return ResponseEntity.ok(demoService.list());
//    }

    public static void main(String[] args) {
        int hashCode = "9".hashCode();
        int hash = Math.abs(9 % 10);
        System.out.println(hashCode);
        System.out.println(hash);

    }
}
