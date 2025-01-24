package com.weilai.ccSpringboot.modules.service;

import com.weilai.ccSpringboot.common.constant.BasePageResult;
import com.weilai.ccSpringboot.modules.entity.RolesEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.weilai.ccSpringboot.modules.request.RoleReq;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author miku
 * @since 2025-01-23
 */
public interface IRolesService extends IService<RolesEntity> {

    BasePageResult<RolesEntity> queryPage(RoleReq params);
}
