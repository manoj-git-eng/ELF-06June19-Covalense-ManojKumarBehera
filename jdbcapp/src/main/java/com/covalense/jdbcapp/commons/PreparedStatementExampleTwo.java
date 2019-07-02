package com.covalense.jdbcapp.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class PreparedStatementExampleTwo {
	public static void main(String[] args) {
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
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			
			
			pstmt.setDouble(2, Double.parseDouble(args[1]));
			
			rs = pstmt.executeQuery();

			// 4.Process the result returned by sql.

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
		} finally {

			// 5.close all jdbc objects.

			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e2) {
				log.info("exception");
			}
		}

	}
}
