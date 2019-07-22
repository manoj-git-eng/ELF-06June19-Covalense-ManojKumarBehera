package com.covalense.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeInfoBean {
	String name;
	int id;
	@Autowired
	private DepartmentBean departmentBean;
	
	

	/*
	 * public EmployeeInfoBean(String name, int id, DepartmentBean departmentBean) {
	 * super(); this.name = name; this.id = id; this.departmentBean =
	 * departmentBean; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	

}
