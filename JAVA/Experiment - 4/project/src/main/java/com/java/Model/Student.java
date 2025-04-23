package com.java.Model;

public class Student extends User{

	
	private String role;
	
	
	Student(String userID,String Name,String password){
		super(userID,Name,password);
	}
	
	String printRole() {
	
		return "Student";
	}


	void displayInfo() {
		
		System.out.println("");
		
		
	}
	
	public void borrowBook() {
		
	}
	public void returnBook() {
		
	}

}
