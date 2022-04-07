package com.tedu.mapper;

import com.tedu.bean.DepBean;

//部门表的mapper接口
public interface DepMapper {
//select * from deparment where id = 1;
	public DepBean selectDepBeanById(int id);
	
}
