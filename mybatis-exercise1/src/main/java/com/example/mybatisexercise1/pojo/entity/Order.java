package com.example.mybatisexercise1.pojo.entity;

import java.util.Date;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description Order实体类
 * @className Order
 * @date 2023/05/08 19:08
 */
public class Order {
    private Integer id;
    private String state;
    private Double amount;
    private Date created;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", amount=" + amount +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
