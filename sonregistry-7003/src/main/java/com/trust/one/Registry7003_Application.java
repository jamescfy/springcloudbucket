package com.trust.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Registry7003_Application {

	public static void main(String[] args) {
		SpringApplication.run(Registry7003_Application.class);
	}

}
