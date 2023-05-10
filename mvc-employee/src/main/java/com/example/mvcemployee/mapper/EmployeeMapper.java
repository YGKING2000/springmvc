package com.example.mvcemployee.mapper;

import com.example.mvcemployee.pojo.entity.Employee;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/11 17:46
 */
public interface EmployeeMapper {
    boolean insert(Employee employee);

    List<Employee> selectAll();

    boolean deleteById(int id);

    boolean updateById(Employee employee);
}
