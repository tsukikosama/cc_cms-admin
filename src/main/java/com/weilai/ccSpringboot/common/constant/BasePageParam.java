package com.weilai.ccSpringboot.common.constant;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasePageParam {
    @ApiModelProperty(value = "第几页", required = true)
    private Long current;
    @ApiModelProperty(value = "一页数量", required = true)
    private Long pageSize;

    @JsonIgnore
    public <T> IPage<T> getPage() {
        if (current == null) {
            current = 1L;
        }
        if (pageSize == null) {
            pageSize = 20L;
        }
        return new Page<>(current, pageSize);
    }
}
