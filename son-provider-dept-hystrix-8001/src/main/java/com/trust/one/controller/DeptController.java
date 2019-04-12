package com.trust.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.trust.one.entities.Dept;
import com.trust.one.service.DeptService;

@RestController
@RequestMapping(value="/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DiscoveryClient client;//暴露服务
	
	@PostMapping(value="/add")
	public boolean insertDept(@RequestBody Dept dept) {
		return deptService.insert(dept);
	}
	
	@GetMapping(value="/list")
	public List<Dept> get(){
		return deptService.queryAll();
	}
	
	@GetMapping(value="/getById/{dno}")
	@HystrixCommand(fallbackMethod="processHystrix_Get") // 报异常后用此方法处理
	public Dept getById(@PathVariable("dno")String dno) {
		Dept dept = deptService.selectByPrimaryKey(dno);
		if(dept == null){
			throw new RuntimeException("该ID: " +dno+ "没有定应的信息");
		}
		return dept;
	}
	
	public Dept processHystrix_Get(String dno){
		Dept dept = new Dept();
		dept.setDname("该ID: " +dno+ "没有定应的信息,null-@HystrixCommand");
		dept.setDbSource("no this database in MySQL");
		return dept;
	}
	
	/**
	 * 向外暴露服务，循环出所有的微服务
	 * @return
	 */
	@RequestMapping(value="/discovery",method = RequestMethod.GET)
	@ResponseBody
	public Object discovery(){
		List<String> list = client.getServices();
		System.out.println("************"+list);
		
		List<ServiceInstance> serverList = client.getInstances("SONPROVIDER-DEPT");
		for(ServiceInstance element : serverList){
			// 主机名  -- 地址  -- 端口
			System.out.println(element.getServiceId() +"\t"+ element.getHost() +"\t"+ element.getPort() 
					+"\t"+ element.getUri() );
		}
		return this.client;
	}
}
