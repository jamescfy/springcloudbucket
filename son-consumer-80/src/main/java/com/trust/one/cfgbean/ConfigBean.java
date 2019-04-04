package com.trust.one.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
}
