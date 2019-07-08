package com.covalense.hibernateapp.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;
import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);

		List<String> ename = query.list();
		for (String empname : ename) {
			log.info("name = " + empname);
		}
		/*
		 * Query query = session.createQuery(hql); List<EmployeeInfoBean>
		 * employeeInfoBeans = query.list();
		 * 
		 * for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
		 * 
		 * log.info("Id is " + employeeInfoBean.getId()); log.info("Name is " +
		 * employeeInfoBean.getName()); log.info("Age is " + employeeInfoBean.getAge());
		 * log.info("Gender is " + employeeInfoBean.getGender()); log.info("Salary is "
		 * + employeeInfoBean.getSalary()); log.info("Joining_date is " +
		 * employeeInfoBean.getJoiningDate()); log.info("Acc is " +
		 * employeeInfoBean.getAccountNumber()); log.info("Email is " +
		 * employeeInfoBean.getEmail()); log.info("Designation is " +
		 * employeeInfoBean.getDesignation()); log.info("Dob is " +
		 * employeeInfoBean.getDateOfBirth()); log.info("ManagerId is " +
		 * employeeInfoBean.getManagerId()); log.info("Phnum is " +
		 * employeeInfoBean.getPhnum()); log.info("D_id is " +
		 * employeeInfoBean.getDepartmentId());
		 * 
		 * }
		 */

	}
}
