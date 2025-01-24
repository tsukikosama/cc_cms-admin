package com.weilai.ccSpringboot.modules.service.impl;

import com.weilai.ccSpringboot.modules.entity.TypeEntity;
import com.weilai.ccSpringboot.modules.mapper.TypeMapper;
import com.weilai.ccSpringboot.modules.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, TypeEntity> implements ITypeService {

}
