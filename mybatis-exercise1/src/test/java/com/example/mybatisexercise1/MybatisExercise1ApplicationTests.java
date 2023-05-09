package com.example.mybatisexercise1;

import com.example.mybatisexercise1.mapper.OrderMapper;
import com.example.mybatisexercise1.pojo.entity.Order;
import com.example.mybatisexercise1.pojo.vo.OrderVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MybatisExercise1ApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    void testInsert() {
        Order order = new Order();
        order.setState("已支付");
        order.setAmount(233.22);
        order.setCreated(new Date());
        System.out.println(orderMapper.insert(order));
    }

    @Test
    void testSelectAll() {
        for (Order order : orderMapper.selectAll()) {
            System.out.println(order);
        }
    }

    @Test
    void testSelectOne() {
        System.out.println(orderMapper.selectOne(3));
    }

    @Test
    void testUpdateOne() {
        Order order = new Order();
        order.setId(5);
        order.setState("已取消");
        order.setAmount(666.77);
        order.setCreated(new Date());
        System.out.println(orderMapper.updateOne(order));
    }

    @Test
    void testDeleteById() {
        System.out.println(orderMapper.deleteById(4));
    }

    @Test
    void testSelectCount() {
        System.out.println(orderMapper.selectCount());
    }

    @Test
    void testSelectByColumn() {
        for (OrderVO orderVO : orderMapper.selectByColumn()) {
            System.out.println(orderVO);
        }
    }
}
