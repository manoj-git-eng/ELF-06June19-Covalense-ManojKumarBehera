package com.covalense.jdbcapp.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExampleTwo {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		int rs;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		String dburl1 = "jdbc:mysql://localhost:3306/myemployee";
		try {
			con = DriverManager.getConnection(dburl1, "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String query = "insert into Dept_info values(16,'IT');";
		log.info("values got inserted into table. ");
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
