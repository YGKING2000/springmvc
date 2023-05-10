package com.example.mvcboot01.pojo.dto;

import org.springframework.stereotype.Controller;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className BMIDTO
 * @date 2023/05/11 14:23
 */
@Controller
public class BMIDTO {
    private Double height;
    private Double weight;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BMIDTO{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
