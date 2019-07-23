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
public class UpdateItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		ItemBean bean = session.get(ItemBean.class, 102);

		bean.setItem_id(102);
		bean.setItem_name("Ballon");
		bean.setCost(20.00);
		bean.setQuantity(41);
		bean.setDescription("Free");

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		log.info("Table Data Updated!!!!");
		txn.commit();
		session.close();

	}
}
