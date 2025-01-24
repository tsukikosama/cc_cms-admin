package com.weilai.ccSpringboot.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.weilai.ccSpringboot.common.constant.BasePageResult;
import com.weilai.ccSpringboot.modules.entity.RolesEntity;
import com.weilai.ccSpringboot.modules.mapper.RolesMapper;
import com.weilai.ccSpringboot.modules.request.RoleReq;
import com.weilai.ccSpringboot.modules.service.IRolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author miku
 * @since 2025-01-23
 */
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, RolesEntity> implements IRolesService {

    @Override
    public BasePageResult<RolesEntity> queryPage(RoleReq params) {
        LambdaQueryWrapper<RolesEntity> wrapper = new LambdaQueryWrapper<>();
        IPage<RolesEntity> page = this.page(params.getPage(), wrapper);
        return BasePageResult.newInstance(page);
    }
}
