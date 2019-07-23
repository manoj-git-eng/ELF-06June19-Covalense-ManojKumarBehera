package com.covalense.EmpIntegration.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.EmpIntegration.beans.NewEmpInfoBean;
import com.covalense.EmpIntegration.config.HibernateConfig;


import lombok.extern.java.Log;

@Log
public class AddItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		NewEmpInfoBean bean = new NewEmpInfoBean();

		bean.setId(4);
		bean.setName("jyothi");
		bean.setAge(21);
		bean.setGender("Female");
		bean.setDesignation("Hr");
		
		

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		txn.commit();
		session.close();

	}

}
