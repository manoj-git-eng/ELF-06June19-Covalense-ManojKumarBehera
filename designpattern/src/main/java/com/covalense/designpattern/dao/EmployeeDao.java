package com.covalense.designpattern.dao;

import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

public interface EmployeeDao {
	ArrayList<EmployeeInfoBean> getAlEmployeeInfo();

	EmployeeInfoBean getEmployeeinfo(String id);

	EmployeeInfoBean getEmployeeinfo(int id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean createEmployeeInfo(String id);

}
