package com.covalense.empl.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.empl.beans.EmployeeInfoBean;

public class HibernateUtil {
   private static SessionFactory factory=null;
	public static SessionFactory buildSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
	public static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=buildSessionFactory();
		}
		return factory;
	}
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
