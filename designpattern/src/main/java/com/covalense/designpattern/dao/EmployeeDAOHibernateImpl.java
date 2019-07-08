package com.covalense.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.designpattern.util.HibernateUtil;
import com.covalense.designpatterns.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDao {
	@Override
	public ArrayList<EmployeeInfoBean> getAlEmployeeInfo() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeinfoBean";
		Query query = session.createQuery(hql);

		List<String> ename = query.list();
		for (String empname : ename) {
			log.info("name = " + empname);
		} return null;		//TODO
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(String id) {

		return getEmployeeinfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeinfo(int id) {
		Configuration config = new Configuration();

		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return null;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		Session session = HibernateUtil.openSession();

		return false;
	}

	@Override
	public boolean createEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
