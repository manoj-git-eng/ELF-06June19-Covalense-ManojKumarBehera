package com.covalense.designpattern.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public HibernateUtil() {
	}

	public static SessionFactory buildSessionFactory() {

		return new Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = getSessionFactory();
		}
		return sessionFactory;
	}

	public static Session openSession() {
		return getSessionFactory().openSession();
	}

}
