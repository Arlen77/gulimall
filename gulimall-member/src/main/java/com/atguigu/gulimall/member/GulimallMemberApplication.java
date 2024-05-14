package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* Openfeign 远程调用
* 1，pom文件里引入open-feign
* 2，编写接口，告诉springboot这个接口需要调用远程服务
*  2.1,声明接口的每一个方法调用哪个远程服务的哪个请求
* 3，开启远程调用 @EnableFeignClients
*
* */
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMemberApplication.class, args);
	}

}
