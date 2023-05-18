package com.example.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户实体类
 * @className User
 * @date 2023/05/12 11:46
 */
@Data
public class UserRegDTO {
    @ApiModelProperty(value = "用户名", required = true, example = "胡歌")
    private String username;
    @ApiModelProperty(value = "用户密码", required = true, example = "123456")
    private String password;
    @ApiModelProperty(value = "用户昵称", required = true, example = "李逍遥")
    private String nickname;
}
