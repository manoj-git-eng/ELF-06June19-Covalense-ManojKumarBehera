package com.covalense.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.CoustomerBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(CoustomerBean.class)
				.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = (SessionFactory) buildSessionFactory().openSession();

		}
		return sessionFactory;
	}

}
