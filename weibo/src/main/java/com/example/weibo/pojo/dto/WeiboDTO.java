package com.example.weibo.pojo.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboDTO
 * @date 2023/05/12 17:24
 */
@Data
public class WeiboDTO {
    @NotEmpty
    // @NotNull
    private String content;
}
