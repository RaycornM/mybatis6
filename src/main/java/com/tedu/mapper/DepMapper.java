package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.DepBean;

//部门表的mapper接口
public interface DepMapper {
//select * from deparment where id = 1;
	public DepBean selectDepBeanById(int id);
	
	//一对多 部门主表  员工副表
	public List<DepBean> selectDepAndEmp();
	//采用子查询方式
	public List<DepBean> selectDepAndEmpTwo();
	
}
