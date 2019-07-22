package com.covalense.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeInfoBeanTest {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("empConfig.xml");
		EmployeeInfoBean bean = (EmployeeInfoBean) applicationContext.getBean("empBean") ; // First Object.

		/*
		 * Scanner scn = new Scanner(System.in);
		 * 
		 * log.info("Enter ID 1="); bean.setId(scn.nextInt()); scn.nextLine();
		 * log.info("Enter Name 1="); bean.setName(scn.nextLine());
		 * 
		 * EmployeeInfoBean bean2 = (EmployeeInfoBean)
		 * applicationContext.getBean("empBean"); // Second Object.
		 * log.info("Enter ID 2="); bean2.setId(scn.nextInt()); scn.nextLine();
		 * log.info("Enter Name 2="); bean2.setName(scn.nextLine());
		 * 
		 * log.info("Name is : " + bean.getName()); log.info("Id is : " + bean.getId());
		 * 
		 * log.info("Name is : " + bean2.getName()); log.info("Id is : " +
		 * bean2.getId());
		 */
		log.info("Name is: "+bean.getName());
		log.info("Id is: "+bean.getId());
		
		
		log.info("DeptId is : " + bean.getDepartmentBean().getDeptId());
		log.info("DeptName is : " + bean.getDepartmentBean().getDeptName());
		
		
		
		
		//((AbstractApplicationContext)applicationContext).close();
	} // End of main.

} // End of class.
