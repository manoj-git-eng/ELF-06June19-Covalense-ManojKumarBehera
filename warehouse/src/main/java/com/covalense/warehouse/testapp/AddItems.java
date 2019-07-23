package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class AddItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		ItemBean bean = new ItemBean();

		bean.setItem_id(104);
		bean.setItem_name("snacks");
		bean.setCost(20.00);
		bean.setQuantity(41);
		bean.setDescription("5 for each");

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		txn.commit();
		session.close();

	}

}
