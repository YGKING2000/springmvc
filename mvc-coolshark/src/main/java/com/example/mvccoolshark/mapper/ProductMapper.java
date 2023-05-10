package com.example.mvccoolshark.mapper;

import com.example.mvccoolshark.pojo.entity.Product;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/11 15:04
 */
public interface ProductMapper {
    boolean insert(Product product);

    List<Product> selectAll();

    boolean deleteById(int id);

    boolean updateById(Product product);
}
