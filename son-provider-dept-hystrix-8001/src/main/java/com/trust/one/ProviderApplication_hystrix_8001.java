package com.trust.one;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
// 扫描mapper类
@MapperScan("com.trust.one.dao")
@EnableEurekaClient //本服务启动后会自动注册进eureka注册中心中
@EnableDiscoveryClient ////Enable***Client 申明自己是干什么的 客户端
@EnableHystrix
public class ProviderApplication_hystrix_8001 {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication_hystrix_8001.class);
	}

}
