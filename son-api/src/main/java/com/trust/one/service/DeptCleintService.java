package com.trust.one.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trust.one.entities.Dept;

@FeignClient(value="SONPROVIDER-DEPT")
@RequestMapping(value="/dept")
public interface DeptCleintService {
	
	// 添加一条部门信息
	@RequestMapping(value = "/add")
	public boolean insert(/* @Param("dept") */ Dept dept);
	
	@RequestMapping(value="/getById/{dno}")
	// 根据id查询一条部门信息
	public Dept selectByPrimaryKey(@PathVariable(value="dno")String id);
	
	@RequestMapping(value="/list")
	// 查询全部部门信息
	public List<Dept> queryAll();
	
}
