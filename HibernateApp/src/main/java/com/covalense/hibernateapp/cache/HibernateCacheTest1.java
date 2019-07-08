package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest1 {
	public static void main(String[] args) {

		// 1.Load config file.
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmpInfoBean.class);

		// 2.Build the session factory.
		SessionFactory factory = config.buildSessionFactory();

		// 3.Open the session.
		Session session = factory.openSession();

		// 4.Interact with DB via session.
		NewEmpInfoBean bean1 = session.get(NewEmpInfoBean.class, 3);
		log.info(bean1.toString());

		NewEmpInfoBean bean2 = session.get(NewEmpInfoBean.class, 3);
		log.info(bean2.toString());

		NewEmpInfoBean bean3 = session.get(NewEmpInfoBean.class, 3);
		log.info(bean3.toString());

		// 5.Close session.
		session.close();

	}
}
