package com.example.mybatisannotation.pojo;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboVO
 * @date 2023/05/08 17:08
 */
public class WeiboVO {
    private String content;
    private Date created;
    private Integer userId;

    @Override
    public String toString() {
        return "WeiboVO{" +
                "content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
