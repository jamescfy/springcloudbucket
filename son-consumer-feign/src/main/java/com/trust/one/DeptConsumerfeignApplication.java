package com.trust.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.trust.one"})
@ComponentScan("com.trust.one")
public class DeptConsumerfeignApplication {
	
	public static void main(String[] args) {

		SpringApplication.run(DeptConsumerfeignApplication.class, args);
	}

}
