package com.covalense.jdbcapp.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class StatementExampleFour {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rs;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl1 = "jdbc:mysql://localhost:3306/myemployee";

			con = DriverManager.getConnection(dburl1, "root", "root");

			String query = "insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?);";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
			pstmt.setInt(3, Integer.parseInt(args[2]));
			
			pstmt.setString(4, (args[3]));
			
			pstmt.setDouble(5, Double.parseDouble(args[4]));//salary
			
			pstmt.setLong(6, Long.parseLong(args[5]));//phone
			
			pstmt.setString(7, (args[6]));//joining date
			
			pstmt.setLong(8, Long.parseLong(args[7]));
			
			pstmt.setString(9, (args[8])); //email
			
			pstmt.setString(10, (args[9]));//designation
			
			
			pstmt.setString(11, (args[10]));
			
			pstmt.setString(12, (args[11]));
			pstmt.setString(13, (args[12]));
			
			
			
			

			rs = pstmt.executeUpdate();

			log.info("values got entered into table. ");

		} catch (Exception e) {
			log.info("");
		}
	}

}
