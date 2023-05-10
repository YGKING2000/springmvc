package com.example.mybatisexercise4.pojo.vo;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className CategoryVO
 * @date 2023/05/10 11:50
 */
public class CategoryVO {
    private String name;
    private String intro;

    @Override
    public String toString() {
        return "CategoryVO{" +
                "name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
