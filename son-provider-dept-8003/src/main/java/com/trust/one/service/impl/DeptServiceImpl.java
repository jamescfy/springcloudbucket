package com.trust.one.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.one.dao.DeptMapper;
import com.trust.one.entities.Dept;
import com.trust.one.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public boolean insert(Dept dept) {
		
		return deptMapper.insert(dept);
	}

	@Override
	public Dept selectByPrimaryKey(String id) {
		
		return deptMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Dept> queryAll() {
		
		return deptMapper.queryAll();
	}
	
}
