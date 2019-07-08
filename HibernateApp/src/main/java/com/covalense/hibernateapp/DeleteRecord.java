package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class DeleteRecord  {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, 15);

		Transaction transaction = session.beginTransaction();
		session.delete(empInfo);
		transaction.commit();
		session.close();

	}

}
