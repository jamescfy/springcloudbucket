package com.trust.one.dao;

import java.util.List;

import com.trust.one.entities.Dept;

public interface DeptMapper {
    
	int deleteByPrimaryKey(String dno);

    boolean insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(String dno);
    
    List<Dept> queryAll();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}