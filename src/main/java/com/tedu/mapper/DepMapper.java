package com.tedu.mapper;

import com.tedu.bean.DepBean;

//���ű��mapper�ӿ�
public interface DepMapper {
//select * from deparment where id = 1;
	public DepBean selectDepBeanById(int id);
	
}
