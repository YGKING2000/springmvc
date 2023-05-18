package com.example.weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CommentDTO
 * @date 2023/05/12 20:27
 */
@Data
public class CommentVO {
    private Integer id;
    private String content;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date created;
    private String nickname;
}
