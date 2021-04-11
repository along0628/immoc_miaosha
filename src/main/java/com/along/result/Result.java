package com.along.result;

import java.util.Objects;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    /**
     * result success
     * @param data
     */
    public static <T> Result<T> success(T data) {
        return new Result(data);
    }

    /**
     * result success
     * @param cm
     */
    public static <T> Result<T> error(CodeMsg cm) {
        return new Result(cm);
    }
    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if (null == cm) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result<?> result = (Result<?>) o;
        return code == result.code &&
                Objects.equals(msg, result.msg) &&
                Objects.equals(data, result.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, data);
    }
}
