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
@TableName("cc_tag")
@ApiModel(value = "TagEntity对象", description = "")
public class TagEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("主键")
    @TableField("tag_id")
    private Integer tagId;

    @ApiModelProperty("类型的id")
    @TableField("type_id")
    private Integer typeId;

    @ApiModelProperty("标签名")
    @TableField("tag_name")
    private String tagName;

    @ApiModelProperty("更新时间")
    @TableField("create_time")
    private LocalDateTime createTime;
}
