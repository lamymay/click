package com.arc.click.controller.data.app;

import com.arc.click.dao.app.ClickRepository;
import com.arc.click.model.domain.app.Click;
import com.arc.click.model.domain.app.LoginUser;
import com.arc.click.service.app.ClickService;
import com.arc.click.service.rbac.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 打卡相关接口
 *
 * @author yechao
 * @since 2021/4/2 13:33
 */
@Slf4j
@RestController
@RequestMapping("/v1/click")
public class ClickRestController {

    /**
     * 打卡服务
     */
    @Autowired
    private ClickService clickService;

    /**
     * 身份认证相关服务
     */
    @Autowired
    private AuthService authService;

    @Autowired
    private ClickRepository clickRepository;

    //@PostMapping(value = "/test")
    @RequestMapping(value = "/check-in", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity checkIn(HttpServletRequest request, @RequestBody Click click) {

        // 1 参数校验
        if (click == null) {
            click = new Click();
        }

        LocalDateTime now = LocalDateTime.now();
        click.setCheckInTime(now);

        // 2 用户登录状态检查 todo 暂时mock掉用户id获取
        Long userId = 1L;
        LoginUser user = authService.checkUserLogin("username", "password");

        if (!user.isAuth()) {
            return new ResponseEntity("登录失败", null, HttpStatus.UNAUTHORIZED);
        }

        // 3 打卡记录的业务逻辑
        String fromHost = request.getHeader("host");
        click.setUserId(userId);
        click.setIp(fromHost);


        /*
         打卡方法暂时没有想清楚,所以逻辑暂定在controller中写
         3.1 需要接口参数去重
         3.2 插入或者更新数据
         3.3 构造返回数据
        */
        ResponseEntity<Map<String, Object>> response = null;
        Map<String, Object> tempMap = new HashMap<>();
        if (click == null) {
            tempMap.put("error", "参数错误");
            response = new ResponseEntity(tempMap, null, HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
        try {
            Click save = clickRepository.save(click);
            if (save == null) {
                tempMap.put("error", "记录保存失败,请重试!");
            } else {
                tempMap.put("data", true);
                tempMap.put("插入的数据是", click);
            }
            response = ResponseEntity.ok(tempMap);
        } catch (Exception exception) {

            log.debug("异常={}", exception);
            tempMap.put("exception", exception.getCause() + exception.getMessage());
        }
        return response;
    }


    @GetMapping(value = "/hello")
    public ResponseEntity hello(HttpServletRequest request) {
        return ResponseEntity.ok(clickService);
    }
}
