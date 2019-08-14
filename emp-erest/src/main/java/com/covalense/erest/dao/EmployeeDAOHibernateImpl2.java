package com.covalense.erest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covalense.erest.dto.EmployeeInfoBean;

@Component
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = sessionFactory.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		return employeeInfoBeans;
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Session session = sessionFactory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}

	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		try {
			EmployeeInfoBean bean = new EmployeeInfoBean();
			bean.setId(id);
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			//log.info("Exception");
			return false;
		}
	}

	public List<EmployeeInfoBean> getEmployeeListInfo(String id) {
		return getEmployeeListInfo(Integer.parseInt(id));
	}

	public List<EmployeeInfoBean> getEmployeeListInfo(int id) {
		String hql = "from EmployeeInfoBean where str(id) like " + "'" + id + "%" + "'";
		// SessionFactory factory = hibernateUtil.openSession();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();

		return employeeInfoBeans;

	}

	@Override
	public List<EmployeeInfoBean> getAllEmployeeListInfo() {
		Session session = sessionFactory.openSession();
		String hql=" from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans =(List<EmployeeInfoBean>)query.list();
		return employeeInfoBeans;
	}

}