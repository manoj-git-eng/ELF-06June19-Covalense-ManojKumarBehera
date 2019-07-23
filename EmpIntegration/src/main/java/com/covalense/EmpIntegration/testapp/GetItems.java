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
public class GetItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		NewEmpInfoBean bean = session.get(NewEmpInfoBean.class, 3);

		log.info("Emp Id : " + bean.getId());
		log.info("Emp Name : " + bean.getName());
		log.info("Degignation : " + bean.getDesignation());
		log.info("Age : " + bean.getAge());
		log.info("Gender : " + bean.getGender());

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		txn.rollback();
		session.close();

	}
}