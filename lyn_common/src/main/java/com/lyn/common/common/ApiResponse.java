package com.lyn.common.common;

import java.io.Serializable;

/**
 * @Description 统一的请求类
 */
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -2728952522935644790L;

    private int code;

    private String msg;

    private T data;

    public boolean isSuccss() {
        return ApiConstants.SUCCESS_CODE == this.code;
    }

    public boolean isFail() {
        return !isSuccss();
    }

    public static <T> ApiResponse<T> ofData(T data) {
        return new ApiResponse(ApiConstants.SUCCESS_CODE, ApiConstants.SUCCESS_MSG, data);
    }

    public static <T> ApiResponse<T> ofSuccess() {
        return ofData(null);
    }

    public static <T> ApiResponse<T> ofFail(String msg) {
        return new ApiResponse(ApiConstants.ERROR_CODE, msg);
    }

    public static <T> ApiResponse<T> ofFail() {
        return new ApiResponse(ApiConstants.ERROR_CODE, ApiConstants.ERROR_MSG);
    }

    private ApiResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
