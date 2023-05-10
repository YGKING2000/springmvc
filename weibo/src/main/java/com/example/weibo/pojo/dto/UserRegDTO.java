package com.example.weibo.pojo.dto;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 用户实体类
 * @className User
 * @date 2023/05/12 11:46
 */
public class UserRegDTO {
    private String username;
    private String password;
    private String nickname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "UserRegDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
