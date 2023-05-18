package com.example.weibo.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className ResultTVO
 * @date 2023/05/16 14:57
 */
@Data
@AllArgsConstructor
public class ResultVO {
    private Integer code;
    private String message;
    private Object data;

    public ResultVO(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
    }

    public ResultVO(Object data) {
        this.code = StatusCode.SUCCESS.getCode();
        this.message = StatusCode.SUCCESS.getMessage();
        this.data = data;
    }

    public ResultVO(StatusCode statusCode, Object data) {
        this(statusCode);
        this.data = data;
    }
}
