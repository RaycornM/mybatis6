package com.tedu.bean;

//����Bean�����ݿ��еı��ֶ�����һ��
public class DepBean {
	private int id;
	private String name;
	
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
