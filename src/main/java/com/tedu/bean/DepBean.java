package com.tedu.bean;

import java.util.List;

//����Bean�����ݿ��еı��ֶ�����һ��
public class DepBean {
	private int id;
	private String name;
	//һ�Զ�
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
