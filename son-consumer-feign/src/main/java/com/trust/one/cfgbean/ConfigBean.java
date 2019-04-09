package com.trust.one.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 
 * @author cfy
 *
 */
@Configuration
public class ConfigBean {
	
	/**
	 * 访问restful风格接口
	 * url、参数、http响应转换被转换成的对象类型
	 * @return
	 */
	@Bean
	@LoadBalanced //开启负载均衡ribbon 直接这个注解就可以了
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule() {
		
		return new RandomRule(); //  负载均衡默认轮询算法改为随机算法
//		return new RetryRule();
	}
}
