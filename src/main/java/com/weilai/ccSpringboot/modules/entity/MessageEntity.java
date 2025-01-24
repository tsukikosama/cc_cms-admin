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
@TableName("cc_message")
@ApiModel(value = "MessageEntity对象", description = "")
public class MessageEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("消息id")
    @TableField("message_id")
    private String messageId;

    @ApiModelProperty("发送者的id")
    @TableField("send_uid")
    private Integer sendUid;

    @ApiModelProperty("接受者的id")
    @TableField("receiver_uid")
    private Integer receiverUid;

    @ApiModelProperty("消息内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("发送消息的时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("消息状态1已读 2 未读")
    @TableField("status")
    private Boolean status;

    @ApiModelProperty("聊天关系的id")
    @TableField("chat_id")
    private Long chatId;
}
