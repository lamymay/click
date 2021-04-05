package com.arc.click.controller.data.app;

import com.arc.click.model.domain.app.Click;
import com.arc.click.model.domain.app.LoginUser;
import com.arc.click.service.rbac.AuthService;
import com.arc.click.service.app.ClickService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

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


    //@PostMapping(value = "/test")
    @RequestMapping(value = "/check-in", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity checkIn(HttpServletRequest request, @RequestBody Click click) {
        if (click == null) {
            click = new Click();
        }

        LocalDateTime now = LocalDateTime.now();
        click.setCheckInTime(now);


        // todo 暂时mock掉用户id获取
        Long userId = 1L;
        LoginUser user=authService.checkUserLogin("username","password");

        String fromHost = request.getHeader("host");
        click.setUserId(userId);
        click.setIp(fromHost);

        return ResponseEntity.ok(clickService.checkIn(click));
    }



    @GetMapping(value = "/hello")
    public ResponseEntity hello(HttpServletRequest request) {
        return ResponseEntity.ok(clickService);
    }
}
