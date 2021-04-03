package com.arc.click.controller.test;

import com.arc.click.dao.test.ProjectRequirementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 叶超
 * @since 2019/4/30 9:43
 */
@Slf4j
@RestController
@RequestMapping("/project")
public class TestProjectController {

    @Resource
    private ProjectRequirementRepository projectRequirementRepository;

    @GetMapping("/get")
    public Object get(@RequestParam String applyExample, @RequestParam String note) {
        return projectRequirementRepository.getByApplyExampleAndNote(applyExample, note);
    }

    @GetMapping("/get/2")
    public Object getTest2(@RequestParam String alias) {
        return projectRequirementRepository.getByTestAlias(alias);
    }

}
