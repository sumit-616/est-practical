package com.java.Database;

import java.util.ArrayList;
import java.util.List;

import com.java.Model.Book;
import com.java.Model.Student;
import com.java.Model.User;

import Service.PDFReading;



// Modules to store the data.


public class LibraryDatabase {
	
	private List<User> users;
	
	private List<Book> books;
	
	
	
	
	
	public LibraryDatabase(Book b1,Book b2 , Book b3) {
		this.users = new ArrayList<>();
		this.books = new ArrayList<>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
	}
	public LibraryDatabase() {
		this.users = new ArrayList<>();
		this.books = new ArrayList<>();
		
	
	}
	
	public int addUser(User newUser) {
		
		for(int i= 0;i<users.size();i++) {
			
			if(newUser.getUserID() == users.get(i).getUserID()) {
				return 0;
			}
		}
		
		users.add(newUser);
		return 1;
		
	}
	
	public int deleteUser(String userID) {
		
		
		for(int i= 0;i<users.size();i++) {
			User u = users.get(i);
			if(u.getUserID()== userID) {	
				u.setIsDelete(true);	
				return 1;
			}
		}
		return 0;
		
	}
	
	public User searchUser(String userID) {
		
		for(int i= 0;i<users.size();i++) {
			User u = users.get(i);
			
			if(!u.getIsDelete() && u.getUserID()==userID) {
				return u;
			}
		}
		
		return null;
		
		
	}
	
	public int addBook(Book newBook) {
		
		books.add(newBook);
		return 1;
		
	}
	
	public void deleteBook(String bookID) {
		
		for(int i= 0;i<books.size();i++) {
			
			
			Book temp = books.get(i);
			
			if(temp.getIsBorrowed() && temp.getBookID() == bookID) {
				temp.setIsBorrowed(true);
			}
		}
		
	}
	
	public Book searchBook(String bookID) {
		
		for(int i= 0;i<books.size();i++) {
			
			Book temp = books.get(i);
			if(!temp.getIsBorrowed() && temp.getBookID().equals(bookID)) {
				return temp;
			}
		}
		return null;
		
	}
	
	
	public void PrintAll() {
		
		for(int i=0;i<users.size();i++) {
			System.out.println("this is working");
			users.size();
			
			System.out.println(users.get(i));
		}
	}
	
	
	public List<Book> getBooks(){
		return books;
	}
	
	
	public Boolean loginUser(String userName,String password) {
		for(int i= 0;i<users.size();i++) {
			
			if(userName.equals(users.get(i).getName()) && password.equals(users.get(i).getPassword())) {
				
				System.out.println("Password is maching");
				
				return true;
			}
			
			
		}
		
		System.out.println("\u001B[31mPassword is not  maching");
		
		return false;
	}
	
	public void readBook(String bookpath) {
		
		if(!bookpath.equals("")) {
			PDFReading o = new PDFReading();
			o.ReadingPDF(bookpath);;
		}else {
			System.out.println("Can't read the empty book");
		}
		
		
	}
	
	
	public int issueBook( Book b) {
		
		if(b.getIsBorrowed().equals(false)) {
			b.setIsBorrowed(true);
			return 1;
		}else {
			return 0;
			
		}
		
	
		
		
		
	}
	
	
	
	

}
