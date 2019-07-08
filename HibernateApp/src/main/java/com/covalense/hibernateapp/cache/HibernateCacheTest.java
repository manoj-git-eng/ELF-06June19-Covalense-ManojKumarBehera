package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {

		log.info("1st= "+getEmployeeData(3).toString());
		log.info("2nd= "+getEmployeeData(3).toString());
		log.info("3rd= "+getEmployeeData(3).toString());
		
	}
	private static NewEmpInfoBean getEmployeeData(int id) {
		// 1.Load config file.
				Configuration config = new Configuration();
				config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
				config.addAnnotatedClass(NewEmpInfoBean.class);

				// 2.Build the session factory.
				SessionFactory factory = config.buildSessionFactory();

				// 3.Open the session.
				Session session = factory.openSession();

				// 4.Interact with DB via session.
				NewEmpInfoBean bean = session.get(NewEmpInfoBean.class, 3);
				log.info(bean.toString());

				

				// 5.Close session.
				session.close();
				return bean;

	}
}
