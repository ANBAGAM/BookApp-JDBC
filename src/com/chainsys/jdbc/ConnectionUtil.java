package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		// 1. Load the class
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Get the connection
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection(url, "hr", "hr");
			System.out.println(connection);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection conn,PreparedStatement psmt,ResultSet rst){
		
		
		try {
			if(rst!=null){
				rst.close();
			}
			if(psmt!=null){
				psmt.close();
			}
			if(rst!=null){
				rst.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
