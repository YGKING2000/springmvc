package com.example.mybatisxml.pojo.vo;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboIndexVO
 * @date 2023/05/10 14:19
 */
public class WeiboIndexVO {
    private Integer id;
    private String content;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "WeiboIndexVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
