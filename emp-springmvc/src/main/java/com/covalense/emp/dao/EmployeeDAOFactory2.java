package com.covalense.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory2 {


	@Bean("jdbc")
	public EmployeeDAO getJDBCInstance() {
		return new EmployeeDAOHibernateImpl2();
	}
	
	@Bean("hibernate")
	public EmployeeDAO getHIBERNATEInstance() {
		return new EmployeeDAOHibernateImpl2();
	}
	

}