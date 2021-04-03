package com.arc.click.controller.test;

import com.arc.click.model.domain.test.SysUser;
import com.arc.click.model.request.SysUserQuery;
import com.arc.click.dao.test.SysUserRepository;
import com.arc.click.service.test.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: yechao
 * @date: 2019/1/10 15:12
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class TestSysUserByJpaController {

    @Autowired
    private SysUserRepository userRepository;

    @GetMapping("/list")
    public Object list() {
        return userRepository.findAll();
    }

    @PostMapping("/test/list/string")
    public Object testStringList(@RequestBody List<String> stringList) {
        log.debug("#############################");
        log.debug("parameter length={}", stringList.size());
        log.debug("#############################");
        return stringList;
    }

    //测试条件查询IN

    @PostMapping("/test/v1/query/in")
    public Object testQueryIn(@RequestBody List<Long> ids) {
        return userRepository.findAllByIdIn(ids);
    }

    @GetMapping("/test/v1/query/in/state")
    public Object test2(@RequestParam Integer state) {
        ArrayList<Long> ids = new ArrayList<>();
        ArrayList<String> avatars = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        ids.add(9L);
        avatars.add("8");
        avatars.add("7");
        List<SysUser> allByIdInAndAndAvatarIn = userRepository.findAllByIdInAndAndAvatarInAndState(ids, avatars, state);
        log.debug("结果={}", allByIdInAndAndAvatarIn.size());
        return allByIdInAndAndAvatarIn;
    }

    @GetMapping("/get")
    public Object get(@RequestParam Long id) {
        log.debug("########### id={}", id);
        return userRepository.existsById(id);
    }
    @Autowired
    private UserService userService;

    @PostMapping("/test/query22")
    public Object testUserService(@RequestBody SysUserQuery request) {
        return userService.listByQuery(request);
    }

//    /**
//     * 排序查询 * @param sortColumn
//     */
//    @GetMapping("/test/user/1")
//    public Object getAllUserBySort1(String sortColumn) {
//        Sort sort = new Sort(Sort.Direction.DESC, Arrays.asList(sortColumn));
//        return sort;
//    }

//
//    @GetMapping("/test/user/2")
//    public Iterable<SysUser> getAllUserBySort2(String sortColumn) {
//
//        Sort.Order order = new Sort.Order(Sort.Direction.ASC, sortColumn);
//        Sort orders = new Sort(order);
//        return userRepository.findAll(orders);
//    }

    @GetMapping("/test/user/3")
    public Iterable<SysUser> getAllUserBySort3(@RequestBody SysUserQuery request) {
        return userService.listByQuery(request);
    }

    @PostMapping("/test/user/page")
    public Object page(@RequestBody SysUserQuery request) {
        System.out.println(request);
        List<String> list = Arrays.asList(request.getSortColumn());
//        Sort sort = new JpaSort(Sort.Direction.DESC,list);
        Pageable pageable = PageRequest.of(request.getPageNumber(), request.getPageSize(),null);
        System.out.println(pageable);
        return userService.pageByQuery(request, pageable);
    }


}
