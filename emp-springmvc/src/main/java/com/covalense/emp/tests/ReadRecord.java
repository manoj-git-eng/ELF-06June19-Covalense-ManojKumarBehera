package com.covalense.emp.tests;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.DepartmentInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		DepartmentInfoBean depInfo = session.get(DepartmentInfoBean.class, 22);

		log.info("Dept id is ====>" + depInfo.getDeptId());
		log.info("Dept name is =====>" + depInfo.getDeptName());

		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, 1);

		log.info("Name  is ====>" + empInfo.getName());
		log.info("Age is =====>" + empInfo.getAge());
		log.info("Gender is ====>" + empInfo.getGender());
		log.info("salary is =====>" + empInfo.getSalary());

		session.close();

	}

}
