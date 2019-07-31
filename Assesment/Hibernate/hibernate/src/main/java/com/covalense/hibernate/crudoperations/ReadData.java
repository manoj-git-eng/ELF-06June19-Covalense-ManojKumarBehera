package com.covalense.hibernate.crudoperations;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.covalense.hibernate.dto.CoustomerBean;
import com.covalense.hibernate.util.HibernateUtil;
import lombok.extern.java.Log;

@Log
public class ReadData {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = " from coustomer; ";

		Query query = session.createQuery(hql);

		List<CoustomerBean> bean = query.getResultList();
		for (CoustomerBean bean2 : bean) {
			log.info("Id = " + bean2.getId());
			log.info("Fname = " + bean2.getFirstname());
			log.info("Lanme = " + bean2.getLastname());
			log.info("Address = " + bean2.getAddress());
			log.info("City = " + bean2.getCity());
			log.info("State = " + bean2.getState());
			log.info("Country = " + bean2.getCountry());
			log.info("ContactNo = " + bean2.getContactNumber());

		}
		session.close();

	}

}
