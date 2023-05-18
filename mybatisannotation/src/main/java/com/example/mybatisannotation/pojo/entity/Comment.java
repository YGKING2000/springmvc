package com.example.mybatisannotation.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 评论实体类
 * @className comment
 * @date 2023/05/09 10:07
 */
@Data
public class Comment {
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
    private Integer weiboId;
}
