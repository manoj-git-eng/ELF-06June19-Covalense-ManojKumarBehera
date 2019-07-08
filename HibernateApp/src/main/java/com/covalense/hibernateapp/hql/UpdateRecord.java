package com.covalense.hibernateapp.hql;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "update from EmployeeinfoBean set Name='vikas' where Id=3";
		Query query = session.createQuery(hql);

		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated " + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
