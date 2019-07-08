package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.DepartmentInfoBean;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class UpdateRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		DepartmentInfoBean depInfo = session.get(DepartmentInfoBean.class, 22);
		depInfo.setDeptName("accounting");

		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, 0);
		empInfo.setGender("female");

		Transaction transaction = session.beginTransaction();
		session.update(depInfo);
		session.update(empInfo);
		transaction.commit();
		session.close();

	}

}
