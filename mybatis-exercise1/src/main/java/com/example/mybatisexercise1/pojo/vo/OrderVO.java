package com.example.mybatisexercise1.pojo.vo;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className OrderVO
 * @date 2023/05/08 19:10
 */
public class OrderVO {
    private String state;
    private Double amount;

    @Override
    public String toString() {
        return "OrderVO{" +
                "state='" + state + '\'' +
                ", amount=" + amount +
                '}';
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
}
