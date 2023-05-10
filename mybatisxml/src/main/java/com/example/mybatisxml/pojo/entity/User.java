package com.example.mybatisxml.pojo.entity;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户实体类
 * @className User
 * @date 2023/05/08 14:27
 */
public class User {
    private Integer id;
    private String username123;
    private Date created;
    private String nickname;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username123 + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username123;
    }

    public void setUsername(String username) {
        this.username123 = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
