package com.example.mvcaddress.mapper;

import com.example.mvcaddress.pojo.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/11 18:58
 */
public interface AddressMapper {
    boolean insert(Address address);

    List<Address> selectAll();

    boolean deleteById(int id);

    boolean updateById(Address address);
}
