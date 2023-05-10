package com.example.mvccoolshark.controller;

import com.example.mvccoolshark.mapper.ProductMapper;
import com.example.mvccoolshark.pojo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className ProductController
 * @date 2023/05/11 15:02
 */
@RestController
@RequestMapping("/v1/product")
public class ProductController {
    @Resource
    private ProductMapper productMapper;

    @RequestMapping("/insert")
    public String insert(Product product) {
        boolean flag = productMapper.insert(product);
        if (flag) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    @RequestMapping("/select")
    public String selectAll() {
        List<Product> productList = productMapper.selectAll();
        StringBuilder html = new StringBuilder("<table style='text-align: center' border='1'>");
        html.append("<caption>商品列表</caption>");
        html.append("<tr><th>id</th><th>标题</th><th>价格</th><th>库存</th><th>操作</th></tr>");
        for (Product p : productList) {
            html.append("<tr>");
            html.append("<td>").append(p.getId()).append("</td>");
            html.append("<td>").append(p.getTitle()).append("</td>");
            html.append("<td>").append(p.getPrice()).append("</td>");
            html.append("<td>").append(p.getNum()).append("</td>");
            html.append("<td><a href='/v1/product/delete?id=").append(p.getId()).append("'>删除</a>").append("</td>");
            html.append("</tr>");
        }
        html.append("</table>");
        return html.toString();
    }

    @RequestMapping("/delete")
    public String deleteById(int id) {
        boolean flag = productMapper.deleteById(id);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">删除成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">删除失败，请重试!</h1>";
        }
    }

    @RequestMapping("/update")
    public String updateById(Product product) {
        boolean flag = productMapper.updateById(product);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">修改成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">修改失败，请重试!</h1>";
        }
    }
}
