package com.weilai.ccSpringboot.modules.service.impl;

import com.weilai.ccSpringboot.modules.entity.TaskEntity;
import com.weilai.ccSpringboot.modules.mapper.TaskMapper;
import com.weilai.ccSpringboot.modules.service.ITaskService;
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
public class TaskServiceImpl extends ServiceImpl<TaskMapper, TaskEntity> implements ITaskService {

}
