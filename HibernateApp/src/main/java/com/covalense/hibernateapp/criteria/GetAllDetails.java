package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> beans = criteria.list();
		for (EmployeeInfoBean bean : beans) {
			log.info("Id= " + bean.getId());
			log.info("Name= " + bean.getName());
			log.info("Age= " + bean.getAge());
			log.info("Gender= " + bean.getGender());
			log.info("AccountNumber= " + bean.getAccountNumber());
			log.info("DepartmentId= " + bean.getDepartmentId());
			log.info("Designation= " + bean.getDesignation());
			log.info("Dob= " + bean.getDateOfBirth());
			log.info("Email= " + bean.getEmail());
			log.info("JoiningDate= " + bean.getJoiningDate());
			log.info("Phone= " + bean.getPhnum());
			log.info("ManagerId= " + bean.getManagerId());
			log.info("Salary= " + bean.getSalary());
		}

	}
}
