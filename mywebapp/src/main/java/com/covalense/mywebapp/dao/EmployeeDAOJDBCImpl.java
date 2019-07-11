package com.covalense.mywebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public final class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			String dburl = "jdbc:mysql://localhost:3306/covalense";
			con = DriverManager.getConnection(dburl, "root", "root");

			log.info("Connection Impl class =======>" + con.getClass());

			String query = "select * from empinfo";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			Date date = null;

			ArrayList<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();
			EmployeeInfoBean bean = new EmployeeInfoBean();
			int count = 0;
			while (rs.next()) {

				bean.setAccountNumber(rs.getLong("acno"));
				bean.setAge(rs.getInt("age"));
				bean.setDepartmentId(rs.getString("deptid"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDateOfBirth(rs.getDate("dateOfBirth"));
				bean.setEmail(rs.getString("email"));
				bean.setGender(rs.getString("gender"));
				bean.setId(rs.getInt("id"));
				bean.setJoiningDate(rs.getDate("joiningDate"));
				bean.setManagerId(rs.getString("managerid"));
				bean.setName(rs.getString("name"));
				bean.setPhnum(rs.getLong("phone"));
				bean.setSalary(rs.getInt("salary"));
				beans.add(bean);
				log.info(++count + "records");
			}
			return beans;
		} catch (SQLException e) {
			log.info(" " + e);
		}
		return null;
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			log.info(" " + e);
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			EmployeeInfoBean bean = null;

			String dburl = "jdbc:mysql://localhost:3306/covalense";
			con = DriverManager.getConnection(dburl, "root", "root");

			String query = "select * from empinfo " + "where id=?  ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			bean = new EmployeeInfoBean();
			while (rs.next()) {

				bean.setAccountNumber(rs.getLong("acno"));
				bean.setAge(rs.getInt("age"));
				bean.setDepartmentId(rs.getString("deptid"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDateOfBirth(rs.getDate("dob"));
				bean.setEmail(rs.getString("email"));
				bean.setGender(rs.getString("gender"));
				bean.setId(rs.getInt("id"));
				bean.setJoiningDate(rs.getDate("joiningDate"));
				bean.setManagerId(rs.getString("managerid"));
				bean.setName(rs.getString("name"));
				bean.setPhnum(rs.getLong("phone"));
				bean.setSalary(rs.getInt("salary"));
			}
			return bean;

		} catch (SQLException e) {
			log.info(" " + e);
			return null;
		}

	}

	public boolean createEmpInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmpInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmpInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createEmpInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
