package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.jdbc.test.TestBookDAOClass;

public class BookDAOClass {
	
	public void addBook(TestBookDAOClass tb){
		
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement preparedStatement=null;
		String sql="insert into books(id,name,price) values(?,?,?)";
		try {
		 preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, tb.id);
			preparedStatement.setString(2, tb.name);
			preparedStatement.setFloat(3, tb.price);
			int rows=preparedStatement.executeUpdate();
			System.out.println("Rows affected:"+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	ConnectionUtil.closeConnection(connection, preparedStatement, null);
	}
	

	

}
