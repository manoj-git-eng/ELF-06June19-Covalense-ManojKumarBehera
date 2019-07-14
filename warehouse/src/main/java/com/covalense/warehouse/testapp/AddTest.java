package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.util.HibernateUtil;

public class AddTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Session session=context.getBean("hibernateUtil",HibernateUtil.class).openSession();
		
		ItemBean bean = new ItemBean();

		bean.setItem_id(109);
		bean.setItem_name("f3");
		bean.setCost(34000.00);
		bean.setQuantity(10);
		bean.setDescription("1 for each");

		Transaction txn = session.beginTransaction();

		session.saveOrUpdate(bean);
		txn.commit();
		session.close();
	}

}
