package com.atguigu.gulimall.product;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
   1.整合Mybatis-plus
     1.1）导入依赖
     <dependency>
         <groupId>com.baomidou</groupId>
         <artifactId>mybatis-plus-boot-starter</artifactId>
         <version>3.2.0</version>
     </dependency>
    1.2）配置
        1.2.1）配置数据源；
            导入数据库的驱动
            在application.yml配置数据源相关信息
        1.2.2）配置mybatis-plus：
            使用@MapperScan告诉Mybatis-plus sql映射文件的位置
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
