package com.weilai.ccSpringboot.modules.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author miku
 * @since 2025-01-23
 */
@Getter
@Setter
@TableName("cc_fans")
@ApiModel(value = "Fans对象", description = "")
public class Fans implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("被关注的人的uid")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("关注的人的uid")
    @TableField("follow_user_id")
    private Integer followUserId;

    @ApiModelProperty("关注的时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("是否关注 0未关注 1 关注")
    @TableField("is_follow")
    private Boolean isFollow;
}
