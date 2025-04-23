package com.java.Model;

import com.java.Database.LibraryDatabase;

public class Admin extends User {
	
	
	
	public Admin(String userID,String Name,String password){
		super(userID,Name,password);
		
	}

	@Override
	String printRole() {
		
		return "Admin";
	}

	@Override
	void displayInfo() {
		
	}
	
	void addBooks(LibraryDatabase ld, Book b1) {
		
		if(!b1.getBookID().equals(ld.searchBook(b1.getBookID()))){
			ld.addBook(b1);
		}else {
			System.out.println("Book is already in the library");
		}
		
		
		
	}

}
