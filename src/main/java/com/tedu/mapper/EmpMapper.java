package com.tedu.mapper;

import java.util.List;
import java.util.Map;

import com.tedu.bean.EmpBean;

/**
 * ���� �� �麯������
 * @author Teacher
 */
public interface EmpMapper {
/*	һ��һ����ѯ1
 * select e.id eid,e.name ename,e.sex,e.salary,e.deparmentid,d.id did,d.name dname
from emp e left join deparment d
on e.deparmentid = d.id;
 */
	public List<EmpBean> selectEmpAndDepOne();
	
	/**
	 * һ���ࣩ��һ����ѯ2
	 * select * from emp;  ��ѯ��deparmentid
	 * select * from deparment where id = 1;  ����deparmentid��ѯ
	 * ��������Ϣ��䵽depBean��
	 */
	public List<EmpBean> selectEmpAndDepTwo();
	
	//����id��Ա��
	public List<EmpBean> selectEmpByDepId(int depId);
	
}
