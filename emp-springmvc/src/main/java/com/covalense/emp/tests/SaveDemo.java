package com.covalense.emp.tests;
import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.*;

public class SaveDemo {

	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(DepartmentInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		/*
		 * EmpInfoBean empInf = new EmpInfoBean(); empInf.setId(15);
		 * empInf.setName("nadgouda"); empInf.setAge(20); empInf.setSalary(50500);
		 * empInf.setPhone(460232); empInf.setAcno(64579495); SimpleDateFormat
		 * format=new SimpleDateFormat("yyyy-mm-dd"); Date
		 * date=format.parse("1993-02-03"); empInf.setDob(date);
		 * empInf.setGender("male"); empInf.setDeptid(22);
		 * empInf.setDesignation("pilot"); empInf.setEmail("manoj@gmail.com"); Date
		 * dateOne=format.parse("2018-08-03"); empInf.setJoiningDate(dateOne);
		 * empInf.setManagerid(112);
		 */

		DepartmentInfoBean deptInf = new DepartmentInfoBean();
		deptInf.setDeptId(15);
		deptInf.setDeptName("IT");

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(deptInf);
		transaction.commit();
		session.close();

		/*
		 * Transaction transaction=session.beginTransaction(); session.save(empInf);
		 * transaction.commit(); session.close();
		 */
	}

}
