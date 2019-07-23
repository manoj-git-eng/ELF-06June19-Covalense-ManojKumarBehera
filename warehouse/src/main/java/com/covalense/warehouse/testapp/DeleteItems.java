package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class DeleteItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		ItemBean bean = session.get(ItemBean.class, 101);

		Transaction txn = session.beginTransaction();
		log.info("Deleted the item from table!!!!!!");

		session.delete(bean);
		txn.commit();
		session.close();

	}
}
