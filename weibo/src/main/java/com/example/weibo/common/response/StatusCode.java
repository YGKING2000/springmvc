package com.example.weibo.common.response;


import lombok.Getter;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 响应状态码枚举类
 * @enumName StatusCode
 * @date 2023/05/16 14:49
 */
@Getter
public enum StatusCode {
    NOT_LOGIN(1000, "未登录"),
    LOGIN_SUCCESS(1001, "登录成功"),
    USERNAME_ERROR(1002, "用户名错误"),
    PASSWORD_ERROR(1003, "密码错误"),
    OPERATION_FAILED(2001, "操作失败"),
    OPERATION_SUCCESS(2002, "操作成功"),
    SUCCESS(200, "OK");

    private int code;
    private String message;

    StatusCode() {
    }

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
