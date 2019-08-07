package com.covalense.emp.dao;

public class EmployeeDAOFactoryOld {

	//private static String dbInstancetype = "msg1";

	private EmployeeDAOFactoryOld() {
	}

	public static EmployeeDAO getInstance(String  dbInstancetype) {
		EmployeeDAO dao = null;
		if (dbInstancetype.equals("jdbc")) {
			dao = null;
		} else if (dbInstancetype.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}
		return dao;
	}// End of get
}