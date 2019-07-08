package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllRestriction {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion criterion = Restrictions.eq("name", "manoj");
		criteria.add(criterion);
		EmployeeInfoBean emp=(EmployeeInfoBean) criteria.uniqueResult();
		log.info(""+emp.getName());
		/*
		 * List<EmployeeInfoBean> beans = criteria.list(); for (EmployeeInfoBean Bean :
		 * beans) {
		 * 
		 * log.info("Id= " + Bean.getId()); log.info("Name= " + Bean.getName());
		 * log.info("Age= " + Bean.getAge()); log.info("Gender= " + Bean.getGender());
		 * log.info("AccountNumber= " + Bean.getAccountNumber());
		 * log.info("DepartmentId= " + Bean.getDepartmentId()); log.info("Designation= "
		 * + Bean.getDesignation()); log.info("Dob= " + Bean.getDateOfBirth());
		 * log.info("Email= " + Bean.getEmail()); log.info("JoiningDate= " +
		 * Bean.getJoiningDate()); log.info("Phone= " + Bean.getPhnum());
		 * log.info("ManagerId= " + Bean.getManagerId()); log.info("Salary= " +
		 * Bean.getSalary());
		 * 
		 * }
		 */

	}
}
