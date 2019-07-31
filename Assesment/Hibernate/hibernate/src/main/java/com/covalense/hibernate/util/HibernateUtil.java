package com.covalense.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.CoustomerBean;

public class HibernateUtil {

	private static SessionFactory factory=null;
	public static SessionFactory buildSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
	public static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=buildSessionFactory();
		}
		return factory;
	}

}
