package com.weilai.ccSpringboot.modules.service.impl;

import com.weilai.ccSpringboot.modules.entity.ChatEntity;
import com.weilai.ccSpringboot.modules.mapper.ChatMapper;
import com.weilai.ccSpringboot.modules.service.IChatService;
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
public class ChatServiceImpl extends ServiceImpl<ChatMapper, ChatEntity> implements IChatService {

}
