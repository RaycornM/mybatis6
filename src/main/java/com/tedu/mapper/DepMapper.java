package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.DepBean;

//���ű��mapper�ӿ�
public interface DepMapper {
//select * from deparment where id = 1;
	public DepBean selectDepBeanById(int id);
	
	//һ�Զ� ��������  Ա������
	public List<DepBean> selectDepAndEmp();
	//�����Ӳ�ѯ��ʽ
	public List<DepBean> selectDepAndEmpTwo();
	
}
