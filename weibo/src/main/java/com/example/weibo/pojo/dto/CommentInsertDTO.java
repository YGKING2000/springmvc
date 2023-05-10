package com.example.weibo.pojo.dto;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CommentInsertDTO
 * @date 2023/05/12 21:22
 */
public class CommentInsertDTO {
    private String content;
    private Integer weiboId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }
}
