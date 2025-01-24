package com.weilai.ccSpringboot.common.constant;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Result<T> implements Serializable {

    private final Integer code;

    private String msg;

    private T data;

    private long timestamp;

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public static Result<Void> success() {
        return new Result<>(0, "操作成功");
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(0, "操作成功", data);
    }

    public static Result<Void> failure() {
        return new Result<>(500, "系统异常，请联系管理员");
    }

    public static Result<Void> failure(String msg) {
        return new Result<>(1, msg);
    }

    public static Result<Void> failure(Integer code, String msg) {
        return new Result<>(code, msg);
    }
}
