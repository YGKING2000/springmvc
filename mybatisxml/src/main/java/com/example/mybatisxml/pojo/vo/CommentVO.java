package com.example.mybatisxml.pojo.vo;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CommentVO
 * @date 2023/05/10 15:43
 */
public class CommentVO {
    private Integer id;
    private String content;
    private Date created;
    private String nickname;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "CommentVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
