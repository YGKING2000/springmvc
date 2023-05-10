package com.example.weibo.pojo.dto;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CommentDeleteDTO
 * @date 2023/05/12 23:45
 */
public class CommentDeleteDTO {
    private Integer id;
    private Integer weiboId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }
}
