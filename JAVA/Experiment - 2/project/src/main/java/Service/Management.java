package Service;

import com.java.Database.LibraryDatabase;
import com.java.Model.Book;

public class Management {
	
	private LibraryDatabase ld;
	
	
	public Management(LibraryDatabase ld) {
		super();
		this.ld = new LibraryDatabase();
	}

	public void borrowBook(String bookId) {
		
		
		if(ld.searchBook(bookId)!=null) {
			
		}
		
	}

	public void returnBook() {
		
	}
	
	
}
