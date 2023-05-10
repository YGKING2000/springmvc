package com.example.mybatisxml.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboDetailVO
 * @date 2023/05/10 14:41
 */
public class WeiboDetailVO {
    private Integer id;
    private String content;
    private String nickname;
    // @JsonFormat(pattern = "yyyy年MM月dd HH:mm:ss", timezone="GMT+8")
    private Date created;

    @Override
    public String toString() {
        return "WeiboDetailVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + getTime() +
                '}';
    }

    private String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return format.format(created);
    }

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
