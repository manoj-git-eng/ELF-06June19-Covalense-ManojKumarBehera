package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class Insert {
	public static void main(String[] args) {

		Transaction transaction = null;
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "insert into NewEmpInfoBean(id,name,gender,designation) select id,name,gender,designation from EmployeeInfoBean where Id=3";
		Query query = session.createQuery(hql);
		
		Transaction transaction1 = null;

		try {
			transaction1 = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated " + result);
			transaction1.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
