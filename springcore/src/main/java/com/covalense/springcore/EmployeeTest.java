package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeInfoBean;
import com.covalense.springcore.configurations.EmployeeConfig;
import com.covalense.springcore.configurations.MessageConfig;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	EmployeeInfoBean employeeInfoBean=applicationContext.getBean(EmployeeInfoBean.class);
	
	
	log.info("Ename = "+employeeInfoBean.getName());
	log.info("ID = "+employeeInfoBean.getId());
	
	
	DepartmentBean departmentBean=employeeInfoBean.getDepartmentBean();
	log.info("DID = "+departmentBean.getDeptId());
	log.info("Dname = "+departmentBean.getDeptName());
	
}
}
