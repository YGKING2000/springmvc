package com.example.mvcemployee.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className MybatisConfig
 * @date 2023/05/12 10:21
 */
@Configuration
@MapperScan("com.example.mvcemployee.mapper")
public class MybatisConfig {
}
