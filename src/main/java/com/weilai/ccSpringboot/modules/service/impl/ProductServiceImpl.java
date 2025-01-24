package com.weilai.ccSpringboot.modules.service.impl;

import com.weilai.ccSpringboot.modules.entity.ProductEntity;
import com.weilai.ccSpringboot.modules.mapper.ProductMapper;
import com.weilai.ccSpringboot.modules.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductEntity> implements IProductService {

}
