package com.example.mvcaddress.controller;

import com.example.mvcaddress.mapper.AddressMapper;
import com.example.mvcaddress.pojo.entity.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className AddressController
 * @date 2023/05/11 19:01
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressMapper addressMapper;

    @RequestMapping("/insert")
    public String insert(Address address) {
        boolean flag = addressMapper.insert(address);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">添加成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">添加失败，请重试!</h1>";
        }
    }

    @RequestMapping("/selectAll")
    public String selectAll() {
        List<Address> addressList = addressMapper.selectAll();
        StringBuilder html = new StringBuilder("<table border='1'>");
        html.append("<caption>员工列表</caption>");
        html.append("<tr><th>序号</th><th>接收人</th><th>具体地址</th><th>邮箱</th><th>电话号码</th><th>标签</th><th>操作</th></tr>");
        for (Address address : addressList) {
            html.append("<tr>");
            html.append("<td>").append(address.getId()).append("</td>");
            html.append("<td>").append(address.getReceiver()).append("</td>");
            html.append("<td>").append(address.getAddress()).append("</td>");
            html.append("<td>").append(address.getEmail()).append("</td>");
            html.append("<td>").append(address.getMobile()).append("</td>");
            html.append("<td>").append(address.getTag()).append("</td>");
            html.append("<td><a href='/address/delete?id=").append(address.getId()).append("'>删除</a>").append("</td>");
            html.append("</tr>");
        }
        html.append("</table>");
        return html.toString();
    }

    @RequestMapping("/delete")
    public String deleteById(int id) {
        boolean flag = addressMapper.deleteById(id);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">删除成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">删除失败，请重试!</h1>";
        }
    }

    @RequestMapping("/update")
    public String updateById(Address address) {
        boolean flag = addressMapper.updateById(address);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">修改成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">修改失败，请重试!</h1>";
        }
    }
}
