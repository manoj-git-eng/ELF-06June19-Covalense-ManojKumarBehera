package com.covalense.designpattern.dao;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {
	}

	private static  String dbInteractionType = "jdbc";

	public static EmployeeDao getInstance() {
		EmployeeDao dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJdbcImpl();
		} else if (dbInteractionType.equals("Hibernate")) {

			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}
}
