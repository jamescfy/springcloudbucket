package com.trust.one.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.trust.one.entities.Dept;


public interface DeptService {
	
		//添加一条部门信息
		public boolean insert(@Param("dept") Dept dept);
		
		//根据id查询一条部门信息
		public Dept selectByPrimaryKey(String id);

		//查询全部部门信息
		public List<Dept> queryAll();
}
