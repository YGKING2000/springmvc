package com.example.weibo.pojo.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboVO
 * @date 2023/05/12 19:59
 */
public class WeiboVO {
    private Integer id;
    private String content;
    // @DateTimeFormat(pattern = "yyyy年MM月dd日 HH:mm:ss")
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
}
