package com.tyss.emportal;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.emportal.dto.EmployeeOtherInfoBean;

public class UpdateRecord {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfoBean empinf = session.get(EmployeeOtherInfoBean.class, 115);
		empinf.setBloodGroup("B-");
		empinf.setSpouseName("nobody");
		empinf.setEmergencyContactNumber(900);

		Transaction transaction = session.beginTransaction();
		session.update(empinf);
		transaction.commit();
		session.close();
	}
}