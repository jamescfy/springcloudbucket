package com.trust.one.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trust.one.entities.Dept;
import com.trust.one.service.DeptCleintService;

@RestController
@RequestMapping(value="/consumer/dept")
public class DeptConsumerConstroller {
	
	@Autowired
	private DeptCleintService deptService;
	
	@PostMapping(value="/add")
	public boolean insertDept(@RequestBody Dept dept) {
		return deptService.insert(dept);
	}
	
	@GetMapping(value="/list")
	public List<Dept> get(){
		return deptService.queryAll();
	}
	
	@GetMapping(value="/getById/{dno}")
	public Dept getById(@PathVariable("dno")String dno) {
		return deptService.selectByPrimaryKey(dno);
		
	}

}
