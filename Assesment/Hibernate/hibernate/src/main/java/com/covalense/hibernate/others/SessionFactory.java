package com.covalense.hibernate.others;

//Write a Session Factory singleton class to get session object.
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.CoustomerBean;

public class SessionFactory {
	private static SessionFactory sessionFactory = null;

	private static Session buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(CoustomerBean.class).buildSessionFactory()
				.openSession();
	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = (SessionFactory) buildSessionFactory();

		}
		return sessionFactory;
	}

}
