package com.example.mybatisannotation;

import com.example.mybatisannotation.mapper.UserMapper;
import com.example.mybatisannotation.mapper.WeiboMapper;
import com.example.mybatisannotation.pojo.User;
import com.example.mybatisannotation.pojo.Weibo;
import com.example.mybatisannotation.pojo.WeiboVO;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.util.Date;

@SpringBootTest
class MybatisannotationApplicationTests {

    /**
     * 测试数据库连接
     */
    // 自动装配
    @Autowired
    private SqlSession sqlSession;

    @Test
    void contextLoads() {
        // 获取数据库连接对象
        Connection connection = sqlSession.getConnection();
        System.out.println(connection);
    }

    /**
     * 测试向数据库中插入一条数据的方法是否可行
     */
    // 1.自动装配
    @Autowired
    private UserMapper userMapper;

    // 2.测试插入数据
    @Test
    void testUserInsert() {
        User user = new User();
        // user.setUsername("胡歌");
        user.setUsername("刘亦菲");
        user.setPassword("123456");
        // user.setNickname("梅长苏");
        user.setNickname("赵盼儿");
        user.setCreated(new Date());
        System.out.println(userMapper.insert(user));
    }

    /**
     * 测试查询user表中的id符合要求的所有数据的指定字段
     */
    @Test
    void testUserSelect() {
        System.out.println(userMapper.selectByIdAndColumn(2));
    }

    /**
     * 测试向weibo表中插入一条数据
     */
    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void testWeiboInsert() {
        Weibo weibo = new Weibo();
        // weibo.setContent("我结婚了");
        // weibo.setContent("我也结婚了");
        /*weibo.setContent("寒蝉凄切，对长亭晚，骤雨初歇。都门帐饮无序，留恋处，兰舟催发。执手相看泪眼，竟无语凝噎。" +
                "念去去，千里烟波，暮霭沉沉楚天阔。多情自古伤离别，更那堪，冷落清秋节！" +
                "今宵酒醒何处？杨柳岸，晓风残月。此去经年，应是良辰好景虚设。" +
                "便纵有千种风情，更与何人说。");*/
        weibo.setContent("十年生死两茫茫，不思量，自难忘。千里孤坟，无处话凄凉。纵使相逢应不识，尘满面，鬓如霜。" +
                "夜来幽梦忽还乡，小轩窗，正梳妆。相顾无言，惟有泪千行。料得年年肠断处，明月夜，短松冈。");
        weibo.setCreated(new Date());
        // weibo.setUserId(1);
        weibo.setUserId(1);
        System.out.println(weiboMapper.insert(weibo));
    }

    /**
     * 测试根据id删除表weibo中一条数据
     */
    @Test
    void testWeiboDeleteById() {
        System.out.println(weiboMapper.deleteById(3));
    }

    /**
     * 测试根据id修改weibo表中的一条数据
     */
    @Test
    void testWeiboUpdateById() {
        Weibo weibo = new Weibo();
        weibo.setId(3);
        /*weibo.setContent("十年生死两茫茫，不思量，自难忘。千里孤坟，无处话凄凉。纵使相逢应不识，尘满面，鬓如霜。" +
                "夜来幽梦忽还乡，小轩窗，正梳妆。相顾无言，惟有泪千行。料得年年肠断处，明月夜，短松冈。");*/
        weibo.setContent("寒蝉凄切，对长亭晚，骤雨初歇。都门帐饮无序，留恋处，兰舟催发。执手相看泪眼，竟无语凝噎。" +
                "念去去，千里烟波，暮霭沉沉楚天阔。多情自古伤离别，更那堪，冷落清秋节！" +
                "今宵酒醒何处？杨柳岸，晓风残月。此去经年，应是良辰好景虚设。" +
                "便纵有千种风情，更与何人说。");
        weibo.setCreated(new Date());
        weibo.setUserId(1);
        // weibo.setUserId(2);
        System.out.println(weiboMapper.updateById(weibo));
    }

    /**
     * 测试查询weibo表中的所有数据
     */
    @Test
    void selectAll() {
        System.out.println(weiboMapper.selectAll());
    }

    /**
     * 测试根据id查询weibo表中的一条数据
     */
    @Test
    void selectById() {
        System.out.println(weiboMapper.selectById(3));
    }

    /**
     * 测试查询weibo表中所有数据的指定字段
     */
    @Test
    void selectByColumn() {
        for (WeiboVO w : weiboMapper.selectByColumn()) {
            System.out.println(w);
        }
    }
}
