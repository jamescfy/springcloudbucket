package com.trust.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.trust.myrule.MyselfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SONPROVIDER-DEPT",configuration=MyselfRule.class)
public class DeptConsumerApplication {
	
	public static void main(String[] args) {

		SpringApplication.run(DeptConsumerApplication.class, args);
	}

}
