package com.weilai.ccSpringboot.modules.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.weilai.ccSpringboot.common.constant.Result;
import com.weilai.ccSpringboot.common.exception.CustomException;
import com.weilai.ccSpringboot.modules.entity.UserEntity;
import com.weilai.ccSpringboot.modules.request.UserLoginReq;
import com.weilai.ccSpringboot.modules.service.IUserService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author miku
 * @since 2025-01-23
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final IUserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody UserLoginReq req){
        UserEntity one = userService.getOne(Wrappers.<UserEntity>lambdaQuery()
                .eq(UserEntity::getUsername, req.getUsername()).eq(UserEntity::getPassword, req.getPassword()));
        if (one == null){
            throw new CustomException("用户名或密码错误");
        }
        StpUtil.login(one.getId());
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        Map<String, Object> data = new HashMap<>();
        data.put("token", tokenInfo.getTokenValue());
        return Result.success(data);
    }

    @GetMapping("/info")
    public Result info(){
        Long userId = StpUtil.getLoginIdAsLong();
        UserEntity user = userService.getById(userId);
        return Result.success(user);
    }


    @ApiOperation("用户注销")
    @GetMapping("logout")
    public Result logout() {
        StpUtil.logout();
        return Result.ok();
    }
}
