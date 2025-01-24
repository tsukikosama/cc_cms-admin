package com.weilai.ccSpringboot.modules.service.impl;

import com.weilai.ccSpringboot.modules.entity.TagEntity;
import com.weilai.ccSpringboot.modules.mapper.TagMapper;
import com.weilai.ccSpringboot.modules.service.ITagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, TagEntity> implements ITagService {

}
