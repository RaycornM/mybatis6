package com.tedu.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.tedu.bean.DepBean;
import com.tedu.bean.EmpBean;
import com.tedu.mapper.DepMapper;
import com.tedu.mapper.EmpMapper;

public class TestMapper extends SuperTestMapper{
	@Test
	public void Test1() {
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectEmpAndDepOne();
		for(EmpBean bean : list) {
			System.out.println(bean);
		}
	}
	
	@Test
	public void Test2() {
		DepMapper mapper = session.getMapper(DepMapper.class);
		DepBean bean = mapper.selectDepBeanById(2);
		System.out.println(bean);
	}
	
	@Test
	public void Test3() {
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectEmpAndDepTwo();
		for(EmpBean bean : list) {
			System.out.println(bean);
		}
	}
}

