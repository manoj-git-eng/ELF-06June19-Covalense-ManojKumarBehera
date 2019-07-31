package com.covalense.hibernate.others;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.dto.CoustomerBean;
import com.covalense.hibernate.dto.StudentBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;


//Write a logic to perform all aggregate(min,max,avg) function on total Marks
//Column in Student Entity Using HQL.

@Log
public class AggregationOperation {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = " max(totalmark) from student ? ";
		Query query = session.createQuery(hql);

		StudentBean bean= new StudentBean();
		log.info("Max mark is = "+bean.getTotalno());
		
		session.close();
	}

}
