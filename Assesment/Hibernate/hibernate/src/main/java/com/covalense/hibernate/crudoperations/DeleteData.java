package com.covalense.hibernate.crudoperations;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.sql.Delete;

import com.covalense.hibernate.util.HibernateUtil;

public class DeleteData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "DELETE from coustomer where id=1;";
		Query query = session.createQuery(hql);

		Transaction txn = null;
		try {
			txn = session.beginTransaction();
			int result=query.executeUpdate();
			txn.commit();

		} catch (Exception e) {

			e.printStackTrace();
		}
		session.close();

	}

}
