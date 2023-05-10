package com.example.weibo.pojo.dto;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className WeiboDTO
 * @date 2023/05/12 17:24
 */
public class WeiboDTO {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WeiboDTO{" +
                "content='" + content + '\'' +
                '}';
    }
}
