package com.example.mybatisexercise1.mapper;

import com.example.mybatisexercise1.pojo.entity.Order;
import com.example.mybatisexercise1.pojo.vo.OrderVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author YGKING  e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @date 2023/05/08 19:10
 */
@Mapper
public interface OrderMapper {
    /**
     * @description 插入一条数据
     * @param order Order
     * @author YGKING
     * @date 2023/05/08 19:13:46
     */
    @Insert("INSERT INTO `order` VALUES(NULL, #{state}, #{amount}, #{created})")
    boolean insert(Order order);

    /**
     * @description 查询所有订单
     * @return java.util.List<com.example.mybatisexercise1.pojo.entity.Order>
     * @author YGKING
     * @date 2023/05/08 20:44:16
     */
    @Select("SELECT * FROM `order`")
    List<Order> selectAll();

    /**
     * @description 根据id查询1个订单
     * @return com.example.mybatisexercise1.pojo.entity.Order
     * @param id int
     * @author YGKING
     * @date 2023/05/08 20:46:37
     */
    @Select("SELECT * FROM `order` WHERE id = #{id}")
    Order selectOne(int id);

    /**
     * @description 根据id修改1个订单
     * @return boolean
     * @param order Order
     * @author YGKING
     * @date 2023/05/08 20:50:15
     */
    @Update("UPDATE `order` SET state = #{state}, amount = #{amount}, created = #{created} WHERE id = #{id}")
    boolean updateOne(Order order);

    /**
     * @description 根据id删除1个订单
     * @param id int
     * @author YGKING
     * @date 2023/05/08 20:56:17
     */
    @Delete("DELETE FROM `order` WHERE id = #{id}")
    boolean deleteById(int id);

    /**
     * @description 统计表中记录数
     * @return java.lang.Integer
     * @author YGKING
     * @date 2023/05/08 20:59:01
     */
    @Select("SELECT COUNT(*) FROM `order`")
    Integer selectCount();

    /**
     * @description 查询所有订单的状态以及金额
     * @return java.util.List<com.example.mybatisexercise1.pojo.vo.OrderVO>
     * @author YGKING
     * @date 2023/05/08 21:04:18
     */
    @Select("SELECT state, amount FROM `order`")
    List<OrderVO> selectByColumn();
}
