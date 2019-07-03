package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class ConnectionPooltest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;

		try {
			pool = new ConnectionPool();
			con = pool.getConnectionFromPool();

			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) { // start of while
				log.info("ID ========> " + rs.getInt("Id"));
				log.info("Name ========> " + rs.getString("Name"));
				log.info("Age ========> " + rs.getInt("Age"));
				log.info("Gender ========> " + rs.getString("Gender"));
				log.info("Salary ========> " + rs.getDouble("Salary"));
				log.info("Phone ========> " + rs.getLong("Phone"));
				log.info("Joing Date ========> " + rs.getDate("Joining_Date"));
				log.info("Account number ========> " + rs.getLong("Account_Number"));
				log.info("Email ========> " + rs.getString("Email"));
				log.info("Designation ========> " + rs.getString("Designation"));
				log.info("Date of birth ========> " + rs.getDate("Date_Of_Birth"));
				log.info("Dept Id ========> " + rs.getString("Dept_Id"));
				log.info("Manager Id ========> " + rs.getString("Manager_Id"));

			} // end of while

		} catch (Exception e) {
			log.info(" " + e);
		} finally {

			try {
				pool.returnConnectionToPool(con);

				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}
}
