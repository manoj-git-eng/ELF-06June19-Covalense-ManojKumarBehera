package com.covalense.emp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;

public class HibernateUtil {
	private static SessionFactory factory = null;

	private static SessionFactory buildSessionFactory() {

		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeOtherInfoBean.class).buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		if (factory == null) {
			factory = buildSessionFactory();
		}
		return factory;
	}
}
