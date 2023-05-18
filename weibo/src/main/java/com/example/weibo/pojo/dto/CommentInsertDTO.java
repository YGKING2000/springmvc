package com.example.weibo.pojo.dto;

import lombok.Data;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CommentInsertDTO
 * @date 2023/05/12 21:22
 */
@Data
public class CommentInsertDTO {
    private String content;
    private Integer weiboId;
}
