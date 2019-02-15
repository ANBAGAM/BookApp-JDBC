package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
	Connection connection=ConnectionUtil.getConnection();
	PreparedStatement preparedStatement=null;
//	ResultSet rset=null;
	
	public void addBook(int id,String name,float price){
		String sql="insert into books(id,name,price) values(?,?,?)";
		try {
		 preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setFloat(3, price);
			int rows=preparedStatement.executeUpdate();
			System.out.println("Rows affected:"+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	ConnectionUtil.closeConnection(connection, preparedStatement, null);
	}
	
	public void updateBook(int id,String name)throws SQLException{	
		String sql="update books set name=? where id=?";
		 preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2,name);
		//preparedStatement.setInt(3,price);
		int rows=preparedStatement.executeUpdate();
		System.out.println("Rows affected:"+rows);
		ConnectionUtil.closeConnection(connection, preparedStatement, null);
	}
	public void deleteBook(int id)throws SQLException{	
		String sql="delete from books where id=?";
		 preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1,id);
		int rows=preparedStatement.executeUpdate();
		System.out.println("Rows affected:"+rows);

		ConnectionUtil.closeConnection(connection, preparedStatement, null);
	}
	
	public void findAll()throws SQLException{	
		String sql="select id,name,price from books";
		 preparedStatement=connection.prepareStatement(sql);
	ResultSet	 rset=preparedStatement.executeQuery(sql);
		System.out.println("Contents of Table");
		while(rset.next()){
			 System.out.println(rset.getInt("id")+" "+rset.getString("name")+" "+rset.getFloat("price"));
		}
		
		ConnectionUtil.closeConnection(connection, preparedStatement, rset);
}


}
