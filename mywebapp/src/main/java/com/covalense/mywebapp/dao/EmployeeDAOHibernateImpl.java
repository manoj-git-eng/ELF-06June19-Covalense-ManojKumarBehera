package com.covalense.mywebapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		ArrayList<EmployeeInfoBean> empInfoBeans = (ArrayList<EmployeeInfoBean>) query.list();
		return empInfoBeans;

	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;

	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();) {
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public boolean createEmpInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmpInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean deleteEmpInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);

		try (Session session = HibernateUtil.openSession();) {
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
	public boolean createEmpInfo(String id) {
		return deleteEmpInfo(Integer.parseInt(id));
	}

	
}
