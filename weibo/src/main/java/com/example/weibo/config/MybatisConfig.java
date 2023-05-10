package com.example.weibo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description 映射接口扫描类
 * @className MybatisConfig
 * @date 2023/05/12 11:32
 */
@Configuration
@MapperScan("com.example.weibo.mapper")
public class MybatisConfig {
}
