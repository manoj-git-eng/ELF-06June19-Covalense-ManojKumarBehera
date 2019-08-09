package com.covalense.hibernateapp.model;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EducationDetailsInfoBean;
import com.covalense.emp.dto.EmployeeAddressInfoBean;
import com.covalense.emp.dto.EmployeeExperienceInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.emp.dto.TrainingInfoBean;

public class HibernateImpl { // for oneToOne,manyToOne mapping.
	private Configuration config = new Configuration();
	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBean, List<EducationDetailsInfoBean> educationDetailsInfoBean,
			List<EmployeeExperienceInfoBean> experienceInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		// session.save(educationDetailsInfoBean);
		// session.save(experienceInfoBean);

		// session.save(addressInfoBean);

		for (EducationDetailsInfoBean detailsInfoBean : educationDetailsInfoBean) {

			session.save(detailsInfoBean);
		}

		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			session.save(employeeAddressInfoBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBean) {
			session.save(employeeExperienceInfoBean);
		}

		transaction.commit();
		session.close();

	}// end of createEmployee method.

	public void createTraining(TrainingInfoBean traInfoBeans) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
			session.save(traInfoBeans);
		transaction.commit();
		session.close();

	}
	public void createTrainingList(List<TrainingInfoBean> traInfoBeans) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		for (TrainingInfoBean trainingInfoBean : traInfoBeans) {
			session.save(trainingInfoBean);
		}
		transaction.commit();
		session.close();

	}
	
	public void createEmployee(EmployeeInfoBean bean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
	}
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
			Session session = factory.openSession();
			EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
			session.close();
			return bean;
	}
	
	
} // end of class.
