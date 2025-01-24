package com.weilai.ccSpringboot.modules.controller;


import com.weilai.ccSpringboot.common.constant.BasePageResult;
import com.weilai.ccSpringboot.common.constant.Result;
import com.weilai.ccSpringboot.modules.entity.RolesEntity;
import com.weilai.ccSpringboot.modules.request.RoleReq;
import com.weilai.ccSpringboot.modules.service.IRolesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author miku
 * @since 2025-01-23
 */
@RestController
@RequestMapping("/rolesEntity")
@AllArgsConstructor
public class RolesController {

    private IRolesService rolesService;
    @GetMapping("/page")
    public Result<BasePageResult<RolesEntity>> page(RoleReq params) {
        return Result.success(rolesService.queryPage(params));
    }
}
