package com.covalense.hibernate.crudoperations;

import javax.persistence.Query;
import javax.xml.bind.ParseConversionEvent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.dto.CoustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

public class InsertData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = " insert into ? ? ? ? ? ? ? ? ";
		Query query = session.createQuery(hql);

		Transaction txn = null;
		try {
			txn = session.beginTransaction();
			int result=query.executeUpdate();
			txn.commit();
			CoustomerBean bean = new CoustomerBean();

			bean.setId(1);
			bean.setFirstname("mmm");
			bean.setLastname("ttt");
			bean.setAddress("shcjg ajbdjab ahb");
			bean.setCity("fgfh");
			bean.setState("shdg");
			bean.setCountry("dshu");
			bean.setContactNumber(5168561);

		} catch (Exception e) {

			e.printStackTrace();
		}
		session.close();
	}

}
