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
public class GetItems {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Session session = factory.openSession();
		ItemBean bean = session.get(ItemBean.class, 102);

		log.info("Item Id : " + bean.getItem_id());
		log.info("Item Name : " + bean.getItem_name());
		log.info("Description : " + bean.getDescription());
		log.info("Cost : " + bean.getCost());
		log.info("Quantity : " + bean.getQuantity());

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		txn.rollback();
		session.close();

	}
}