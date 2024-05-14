package com.atguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
* 如何使用nacos配置中心
* 1，引入依赖
* <dependency>
	<groupId>com.alibaba.cloud</groupId>
	<artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 </dependency>
 * 2,创建一个bootstrap.properties
 * spring.application.name=gulimall-coupon
   spring.cloud.nacos.config.server-addr=127.0.0.1:8848
   3,nacos配置中心默认添加配置列表 gulimall-coupon.properties
   4，动态获取配置 添加
   @RefreshScope 动态获取刷新配置
   @Value("${coupon.user.age}") 获取到配置
* */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.coupon.dao")
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
