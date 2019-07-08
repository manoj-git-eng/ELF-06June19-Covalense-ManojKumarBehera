package com.covalense.hibernateapp.hql;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		//String hql = "delete from EmployeeInfoBean where Id=3";
		//String hql = "delete from EmployeeInfoBean where Id=:Id";
		String hql = "update from EmployeeInfoBean set Name='"+args[0]+"' where Id="+args[1]+"";
		Query query = session.createQuery(hql);
		//query.setParameter("Id", args[0]);
		//query.setParameter("Name", args[1]);
		

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
