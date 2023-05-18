package com.example.weibo.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户实体类
 * @className User
 * @date 2023/05/12 11:46
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date created;
}
