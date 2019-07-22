package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeInfoBean;

@Configuration
public class EmployeeConfig {
	@Bean
	public EmployeeInfoBean getEmployeeInfoBean() {
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setId(34);
		employeeInfoBean.setName("Varun");
		return employeeInfoBean;
	}

	@Bean
	public DepartmentBean getDepartmentBean() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(45);
		departmentBean.setDeptName("Nepotism");
		return departmentBean;
	}

}
