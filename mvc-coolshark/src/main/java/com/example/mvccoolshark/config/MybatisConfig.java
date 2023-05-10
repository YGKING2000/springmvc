package com.example.mvccoolshark.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className MybatisConfig
 * @date 2023/05/12 09:29
 */
// 1.Configuration注解：设置当前类为配置类，启动工程时会自动运行
@Configuration
// 2.MapperScan为扫描注解，省去了每个Mapper映射接口上面添加@Mapper注解，参数为mapper的包的完整路径
@MapperScan("com.example.mvccoolshark.mapper")
public class MybatisConfig {
}
