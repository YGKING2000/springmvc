package com.example.weibo.pojo.entity;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 微博实体类
 * @className Weibo
 * @date 2023/05/12 11:47
 */
public class Weibo {
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Weibo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", userId=" + userId +
                '}';
    }
}
