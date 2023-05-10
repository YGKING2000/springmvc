package com.example.mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 订单控制类
 * @className OrderController
 * @date 2023/05/10 17:40
 */
@Controller
public class OrderController {
    @RequestMapping("/selectOrder")
    @ResponseBody// 表示将当前方法的返回值作为响应体发送给客户端，可以添加html代码
    public String selectOrder() {
        return "<h1 style=\"color: red; text-align: center\">小伙狂不狂，必须来根芙蓉王</h1>";
    }

    @RequestMapping("/deleteOrder")
    @ResponseBody
    public String deleteOrder() {
        return "<h1 style=\"color: red; text-align: center\">删除订单成功!</h1>";
    }

    @RequestMapping("/createOrder")
    @ResponseBody
    public String createOrder() {
        return "<h1 style=\"color: green; text-align: center\">创建订单成功!</h1>";
    }
}
