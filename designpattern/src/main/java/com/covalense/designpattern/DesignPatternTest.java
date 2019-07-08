package com.covalense.designpattern;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.covalense.designpattern.dao.EmployeeDAOFactory;
import com.covalense.designpattern.dao.EmployeeDao;
import com.covalense.designpatterns.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class DesignPatternTest {
	public static void main(String[] args) {
		// EmployeeDAOJdbcImpl dao = new EmployeeDAOHibernateImpl();
		// EmployeeInfoBean bean = dao.getEmployeeinfo(1);
		EmployeeDao dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeinfo(1));
		printInfo(dao.getEmployeeinfo("2"));

		ArrayList<EmployeeInfoBean> beans = dao.getAlEmployeeInfo();
		for (EmployeeInfoBean beann : beans) {
			printInfo(beann);
		}

		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(15);
		empInf.setName("nadgouda");
		empInf.setAge(20);
		empInf.setSalary(50500);
		empInf.setAge(460232);
		empInf.setAge(64579495);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		empInf.setGender("male");
		empInf.setDesignation("pilot");
		empInf.setEmail("manoj@gmail.com");
	} // end of main

	private static void printInfo(EmployeeInfoBean bean) {
		log.info(""+bean.getId());
		log.info(bean.getName());
		log.info("" + bean.getAge());
		log.info(bean.getDepartmentId());
		log.info(bean.getDesignation());
		log.info(bean.getEmail());
		log.info(bean.getJoiningDate());
		log.info("" + bean.getAccountNumber());
		log.info(bean.getDateOfBirth());
		log.info(bean.getManagerId());
		log.info(bean.getGender());
		log.info("" + bean.getSalary());
		log.info("" + bean.getPhnum());
	}
}
