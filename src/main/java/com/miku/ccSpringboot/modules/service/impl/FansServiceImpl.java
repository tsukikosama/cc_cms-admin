package com.miku.ccSpringboot.modules.service.impl;

import com.miku.ccSpringboot.modules.entity.Fans;
import com.miku.ccSpringboot.modules.mapper.FansMapper;
import com.miku.ccSpringboot.modules.service.IFansService;
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
public class FansServiceImpl extends ServiceImpl<FansMapper, Fans> implements IFansService {

}
