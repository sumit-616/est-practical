package com.java.Model;

public class Book {
	
	
	private String bookID;
	
	private String title;
	private String author;
	private Boolean isBorrowed;
	
	private String borrowedBy;
	
	
	public Book(String bookID, String title, String author) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
		this.borrowedBy = null;
	}
	
	
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	


	public Boolean getIsBorrowed() {
		return isBorrowed;
	}
	public void setIsBorrowed(Boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	public String getBorrowedBy() {
		return borrowedBy;
	}
	public void setBorrowedBy(String borrowedBy) {
		this.borrowedBy = borrowedBy;
	}
	public void borrow() {
		
		
	}
	public void returnBook() {
		
	}
	

}
