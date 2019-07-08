package com.covalense.designpattern.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJdbcImpl implements EmployeeDao {

	public static ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		String dburl1 = "jdbc:mysql://localhost:3306/myemployee";
		String query = "select * from employee_info";

		try (Connection con = DriverManager.getConnection(dburl1, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}

			log.info("connection impl class ====>" + con.getClass());

			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) { // start of while
				EmployeeInfoBean bean = new EmployeeInfoBean();

				bean.setId(rs.getInt("Id"));
				bean.setName(rs.getString("Name"));
				bean.setId(rs.getInt("Age"));
				bean.setGender(rs.getString("Gender"));
				bean.setSalary(rs.getDouble("Salary"));
				bean.setJoiningDate(rs.getString("Gender"));
				bean.setAccountNumber(rs.getLong("Account_Number"));
				bean.setDesignation(rs.getString("Designation"));
				bean.setDateOfBirth(rs.getString("Date_Of_Birth"));
				bean.setDepartmentId(rs.getString("Dept_Id"));
				bean.setManagerId(rs.getString("Manager_Id"));

				beans.add(bean);
			} // end of while

		} catch (SQLException e) {
			log.info("error");
		}
		return null;
	}

	public EmployeeInfoBean getEmployeeinfo(String id) {
		try {
			return getEmployeeinfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeinfo(int id) {
		Connection con = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1.Load the driver.

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				log.info("Exception");
			}

			// 2.Get the db connection.

			String dburl1 = "jdbc:mysql://localhost:3306/myemployee";
			con = DriverManager.getConnection(dburl1, "root", "root");
			log.info("connection impl class ====>" + con.getClass());

			// 3.Issue Sql queries via connection

			String query = "select * from employee_info" + " where Id=? and Manager_Id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, "id");

			rs = pstmt.executeQuery();

			// 4.Process the result returned by sql.

			EmployeeInfoBean bean = new EmployeeInfoBean();

			while (rs.next()) { // start of while

				log.info("ID ========> " + rs.getInt("Id"));
				log.info("Name ========> " + rs.getString("Name"));
				log.info("Age ========> " + rs.getInt("Age"));
				log.info("Gender ========> " + rs.getString("Gender"));
				log.info("Salary ========> " + rs.getDouble("Salary"));
				log.info("Joing Date ========> " + rs.getDate("Joining_Date"));
				log.info("Account number ========> " + rs.getLong("Account_Number"));
				log.info("Designation ========> " + rs.getString("Designation"));
				log.info("Date of birth ========> " + rs.getDate("Date_Of_Birth"));
				log.info("Dept Id ========> " + rs.getString("Dept_Id"));
				log.info("Manager Id ========> " + rs.getString("Manager_Id"));

			} // end of while

		} catch (SQLException e) {
			log.info("error");
		}
		return null;

	}

	@Override
	public ArrayList<EmployeeInfoBean> getAlEmployeeInfo() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
