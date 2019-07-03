package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public final class JdbcProgramForAwsDb {
	public static void main(String[] args) {
		String dburl1 = "jdbc:mysql://mysqlmanoj.cimuz0lhuexn.ap-south-1.rds.amazonaws.com:3306/mysqlmanoj";
		String query = "select * from employee_info";

		try (Connection con = DriverManager.getConnection(dburl1, "root", "72728888Mm");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}

			log.info("connection impl class ====>" + con.getClass());

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
	}
}
