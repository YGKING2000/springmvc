package com.example.mvcboot01.controller;

import com.example.mvcboot01.pojo.dto.BMIDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className BMIController
 * @date 2023/05/11 14:09
 */
@Controller
public class BMIController {
    /* BMI身体质量指数测试:声明参数方式接收客户端传递的数据 */
    /*@RequestMapping("/bmi")
    @ResponseBody
    public String getBMI(Double weight, Double height) {
        String message;
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            message = "偏廋";
        } else if (bmi < 24) {
            message = "正常";
        } else if (bmi < 27) {
            message = "微胖";
        } else {
            message = "该减肥了!";
        }
        return message;
    }*/

    /* BMI身体质量指数测试:使用poj0类的方式接收客户端传递的数据 */
    @RequestMapping("/bmi")
    @ResponseBody
    public String getBMI(BMIDTO bmiDTO) {
        String message;
        double bmi = bmiDTO.getWeight() / Math.pow(bmiDTO.getHeight(), 2);
        if (bmi <= 18.5) {
            message = "偏廋";
        } else if (bmi < 24) {
            message = "正常";
        } else if (bmi < 27) {
            message = "微胖";
        } else {
            message = "该减肥了!";
        }
        return message;
    }

}
