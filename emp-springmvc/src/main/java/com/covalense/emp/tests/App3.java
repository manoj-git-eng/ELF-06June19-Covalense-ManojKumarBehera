package com.covalense.emp.tests;

import java.util.Arrays;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.TrainingInfoBean;
import com.covalense.hibernateapp.model.HibernateImpl;

public class App3 {
	public static void main(String[] args) {
		TrainingInfoBean bean=new TrainingInfoBean();
		bean.setCourseId(107);
		bean.setCourseName("kali");
		bean.setCourseType("fulltime");
		bean.setDuration(8);
		
		HibernateImpl impl=new HibernateImpl();
		EmployeeInfoBean infoBean=impl.getEmployeeInfoBean(456);
		
		
		EmployeeInfoBean infoBean2=new EmployeeInfoBean();
		infoBean2.setId(678);
		infoBean2.setName("jadu");
		
		bean.setInfoBeans(Arrays.asList(infoBean,infoBean2));
		impl.createTraining(bean);
	}

}
