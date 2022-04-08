package com.tedu.bean;

import java.util.List;

//部门Bean和数据库中的表字段描述一样
public class DepBean {
	private int id;
	private String name;
	//一对多
	private List<EmpBean> list;
	
	public List<EmpBean> getList() {
		return list;
	}
	public void setList(List<EmpBean> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DepBean [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
