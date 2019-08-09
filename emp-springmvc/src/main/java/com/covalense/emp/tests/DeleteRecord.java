package com.covalense.emp.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

public class DeleteRecord  {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, 267);

		Transaction transaction = session.beginTransaction();
		session.delete(empInfo);
		transaction.commit();
		session.close();

	}

}
