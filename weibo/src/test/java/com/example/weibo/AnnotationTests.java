package com.example.weibo;

import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Data
class Point {
    @ApiProperty(value = "x轴坐标", required = true, example = "10")
    private int x;
    @ApiProperty(value = "y轴坐标", required = true, example = "10")
    private int y;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ApiProperty {

    String value() default "";

    boolean required() default false;

    String example() default "";
}

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className AnnotationTests
 * @date 2023/05/16 10:19
 */
@SpringBootTest
public class AnnotationTests {
    @Test
    public void doTest() throws NoSuchFieldException {
        Class<?> clazz = Point.class;
        Field field = clazz.getDeclaredField("x");
        ApiProperty annotation = field.getAnnotation(ApiProperty.class);
        String value = annotation.value();
        boolean required = annotation.required();
        String example = annotation.example();
    }
}
