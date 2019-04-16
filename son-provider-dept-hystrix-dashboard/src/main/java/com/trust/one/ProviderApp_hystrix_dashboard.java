package com.trust.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ProviderApp_hystrix_dashboard {

	public static void main(String[] args) {
		
		SpringApplication.run(ProviderApp_hystrix_dashboard.class, args);
	}

}
