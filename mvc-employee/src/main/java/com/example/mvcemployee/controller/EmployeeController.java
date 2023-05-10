package com.example.mvcemployee.controller;

import com.example.mvcemployee.mapper.EmployeeMapper;
import com.example.mvcemployee.pojo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className EmployeeController
 * @date 2023/05/11 17:47
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmployeeMapper employeeMapper;

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Employee employee) {
        boolean flag = employeeMapper.insert(employee);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">添加成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">添加失败，请重试!</h1>";
        }
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public String selectAll() {
        List<Employee> employeeList = employeeMapper.selectAll();
        StringBuilder html = new StringBuilder("<table border='1'>");
        html.append("<caption>员工列表</caption>");
        html.append("<tr><th>id</th><th>姓名</th><th>工资</th><th>岗位</th><th>操作</th></tr>");
        for (Employee employee : employeeList) {
            html.append("<tr>");
            html.append("<td>").append(employee.getId()).append("</td>");
            html.append("<td>").append(employee.getTitle()).append("</td>");
            html.append("<td>").append(employee.getSalary()).append("</td>");
            html.append("<td>").append(employee.getJob()).append("</td>");
            html.append("<td><a href='/employee/delete?id=").append(employee.getId()).append("'>删除</a>").append("</td>");
            html.append("</tr>");
        }
        html.append("</table>");
        return html.toString();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteById(int id) {
        boolean flag = employeeMapper.deleteById(id);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">删除成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">删除失败，请重试!</h1>";
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateById(Employee employee) {
        boolean flag = employeeMapper.updateById(employee);
        if (flag) {
            return "<h1 style=\"color: green; text-align: center\">修改成功!</h1>";
        } else {
            return "<h1 style=\"color: red; text-align: center\">修改失败，请重试!</h1>";
        }
    }
}
