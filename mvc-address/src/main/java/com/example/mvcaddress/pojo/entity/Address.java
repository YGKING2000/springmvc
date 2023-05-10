package com.example.mvcaddress.pojo.entity;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Address
 * @date 2023/05/11 18:59
 */
public class Address {
    private Integer id;
    private String receiver;
    private String address;
    private String email;
    private String mobile;
    private String tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
