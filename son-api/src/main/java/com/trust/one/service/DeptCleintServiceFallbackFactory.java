	package com.trust.one.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.trust.one.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptCleintServiceFallbackFactory implements FallbackFactory<DeptCleintService> {

	@Override
	public DeptCleintService create(Throwable cause) {

		return new DeptCleintService() {
			
			@Override
			public Dept selectByPrimaryKey(String id) {
				
				return new Dept().setDno(id).setDname("木有对应的信息，客户端提供的降级信息请您过目").setDno("no this data in table");
			}
			
			@Override
			public List<Dept> queryAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean insert(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
