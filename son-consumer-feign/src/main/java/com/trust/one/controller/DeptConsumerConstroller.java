package com.trust.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.trust.one.entities.Dept;

@RestController
@RequestMapping(value="/consumer/dept")
public class DeptConsumerConstroller {

//	private static final String REST_URL_PREFIX ="http://localhost:8001/";
	private static final String REST_URL_PREFIX ="http://SONPROVIDER-DEPT/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/list")
		public List<Dept> list(){
			return restTemplate.getForObject(REST_URL_PREFIX+"dept/list", List.class);
		}
	
	@RequestMapping(value="/getById/{dno}")
	public Dept get(@PathVariable(name="dno") String dno){
		return restTemplate.getForObject(REST_URL_PREFIX+"dept/getById/"+dno, Dept.class);
	}
	
	@RequestMapping(value = "/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "dept/add", dept, Boolean.class);
	}

	// 消费者调用服务的 服务发现
	@RequestMapping(value = "/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
	}
}
