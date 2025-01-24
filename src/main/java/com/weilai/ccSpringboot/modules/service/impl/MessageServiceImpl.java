package com.weilai.ccSpringboot.modules.service.impl;

import com.weilai.ccSpringboot.modules.entity.MessageEntity;
import com.weilai.ccSpringboot.modules.mapper.MessageMapper;
import com.weilai.ccSpringboot.modules.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, MessageEntity> implements IMessageService {

}
