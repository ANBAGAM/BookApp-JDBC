package com.chainsys.jdbc.test;

import java.util.Scanner;

import com.chainsys.jdbc.BookDAO;
import com.chainsys.jdbc.BookDAOClass;

public class TestBookDAOClass {
	public int id;
	public String name;
	public float price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Scanner scanner = new Scanner(System.in);
		int A=0;
		do{
		System.out.println("\n1.Add Books\n2.View ALL\n3.Exit\nEnter Your Option:");
		int option = scanner.nextInt();
		BookDAOClass bookDAOClass = new BookDAOClass();
		switch (option) {
		case 1:
			System.out.println("Enter the id , name, price");

			TestBookDAOClass testBookDAOClass=new TestBookDAOClass(); 
			testBookDAOClass.id = scanner.nextInt();
			testBookDAOClass.name = scanner.next();
			 testBookDAOClass.price = scanner.nextFloat();
			 
			bookDAOClass.addBook(testBookDAOClass);

			break;

		case 2:
			// System.out.println("Enter the id , name, price");

			// BookDAO bookDAO1=new BookDAO();
			//bookDAO.findAll();

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
