package com.covalense.hibernate.others;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.dto.CoustomerBean;
import com.covalense.hibernate.dto.StudentBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

// Create a store Procedure on student table 
//and write a program to call the same stored Procedure using hibernate.
@Log
public class StoreProcedure {
	public static void main(String[] args) {
			
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		StoredProcedureQuery procedureQuery=session.createStoredProcedureQuery("sp1");
		CoustomerBean bean=new CoustomerBean();
		
		log.info("Id = " + bean.getId());
		log.info("Fname = " + bean.getFirstname());
		log.info("Lanme = " + bean.getLastname());
		log.info("Address = " + bean.getAddress());
		log.info("City = " + bean.getCity());
		log.info("State = " + bean.getState());
		log.info("Country = " + bean.getCountry());
		log.info("ContactNo = " + bean.getContactNumber());
		
		StudentBean bean2=new StudentBean();
		
		log.info("roll no = "+bean2.getFirstname());
		log.info("roll no = "+bean2.getLastname());
		log.info("roll no = "+bean2.getSubject());
		log.info("roll no = "+bean2.getTotalno());
		bean.setStudent(bean2);
				
	}

}
