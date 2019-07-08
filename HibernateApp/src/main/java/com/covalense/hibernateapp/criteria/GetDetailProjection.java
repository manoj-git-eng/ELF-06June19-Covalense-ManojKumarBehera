package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailProjection {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection projectionOne = Projections.property("name");
		Projection projectionTwo = Projections.property("id");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projectionOne);
		projectionList.add(projectionTwo);
		criteria.setProjection(projectionList);
		List<Object[]> li = criteria.list();
		for (Object[] obj : li) {
			log.info("name are " + obj[0]);
			log.info("id are " + obj[1]);
		}

	}

}
