package com.example.demo.entity;

public class BaseResponse<T> {

    private String code = "200";
    private String msg = "Success";
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
