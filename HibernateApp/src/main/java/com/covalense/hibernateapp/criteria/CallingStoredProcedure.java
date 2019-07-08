package com.covalense.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class CallingStoredProcedure {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query=session.createStoredProcedureCall("Sp1", EmployeeInfoBean.class);
		
		List<EmployeeInfoBean> beans=query.getResultList();
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
