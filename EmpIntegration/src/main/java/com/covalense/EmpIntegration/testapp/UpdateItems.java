package com.covalense.EmpIntegration.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.EmpIntegration.beans.NewEmpInfoBean;
import com.covalense.EmpIntegration.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class UpdateItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		NewEmpInfoBean bean = session.get(NewEmpInfoBean.class, 3);

		bean.setId(3);
		bean.setName("nagraj");
		bean.setAge(22);
		bean.setGender("male");
		bean.setDesignation("Hr");

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		log.info("Table Data Updated!!!!");
		txn.commit();
		session.close();

	}
}
