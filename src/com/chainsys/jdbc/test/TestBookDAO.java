package com.chainsys.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.omg.CORBA.Environment;

import com.chainsys.jdbc.BookDAO;

public class TestBookDAO {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int A=0;
		do{
		System.out.println("\n1.Add Books\n2.View ALL\n3.Exit\nEnter Your Option:");
		int option = scanner.nextInt();
		BookDAO bookDAO = new BookDAO();
		switch (option) {
		case 1:
			System.out.println("Enter the id , name, price");

			int id = scanner.nextInt();
			String name = scanner.next();
			float price = scanner.nextFloat();

			bookDAO.addBook(id, name, price);

			break;

		case 2:
			// System.out.println("Enter the id , name, price");

			// BookDAO bookDAO1=new BookDAO();
			bookDAO.findAll();

			break;
		case 3:
			System.exit(0);
			break;
		default:
			break;
		}
		
		}while(A<3);
		scanner.close();

	}

}
