package com.covalense.emp.dao;

import java.util.List;

import com.covalense.emp.dto.EmployeeInfoBean;



public interface EmployeeDAO {

	List<EmployeeInfoBean> getEmployeeListInfo(String id);

	List<EmployeeInfoBean> getEmployeeListInfo(int id);

	EmployeeInfoBean getEmployeeInfo(int id);

	EmployeeInfoBean getEmployeeInfo(String id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);

}// End of class