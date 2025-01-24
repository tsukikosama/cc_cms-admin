package com.weilai.ccSpringboot.common.constant;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BasePageResult<T> {

    private List<T> list;

    private int total;

    public BasePageResult(List<T> list, int total) {
        this.list = list;
        this.total = total;
    }

    public static <E> BasePageResult<E> newInstance(IPage<E> page) {
        return new BasePageResult<>(page.getRecords(), (int) page.getTotal());
    }
}
