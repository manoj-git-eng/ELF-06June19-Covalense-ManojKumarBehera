package com.covalense.mywebapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	List<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);
	
	
	

	boolean createEmpInfo(EmployeeInfoBean bean);

	boolean updateEmpInfo(EmployeeInfoBean bean);

	boolean deleteEmpInfo(int id);

	boolean createEmpInfo(String id);
}
