package com.tedu.mapper;

import java.util.List;
import java.util.Map;

import com.tedu.bean.EmpBean;

/**
 * 排序 和 组函数处理
 * @author Teacher
 */
public interface EmpMapper {
/*	一对一多表查询1
 * select e.id eid,e.name ename,e.sex,e.salary,e.deparmentid,d.id did,d.name dname
from emp e left join deparment d
on e.deparmentid = d.id;
 */
	public List<EmpBean> selectEmpAndDepOne();
	
	/**
	 * 一（多）对一多表查询2
	 * select * from emp;  查询出deparmentid
	 * select * from deparment where id = 1;  依据deparmentid查询
	 * 出部门信息填充到depBean中
	 */
	public List<EmpBean> selectEmpAndDepTwo();
	
	//部门id查员工
	public List<EmpBean> selectEmpByDepId(int depId);
	
}
