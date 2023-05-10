package com.example.mvccoolshark.pojo.entity;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className entity
 * @date 2023/05/11 14:55
 */
public class Product {
    private Integer id;
    private String title;
    private Double price;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
