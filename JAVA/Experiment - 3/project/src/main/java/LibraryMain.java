

import java.util.List;
import java.util.Scanner;

import com.java.Database.LibraryDatabase;
import com.java.Model.Book;

import utils.LibraryManagement;

public class LibraryMain {
	
	
	public static void main(String[] args) {
		
		
			Book b1 = new Book("1001","Prince of Hooland","James");
	        Book b2 = new Book("1002", "The Lost Treasure", "Sarah Connor");
	        Book b3 = new Book("1003", "Kingdom of Fire", "Tom Hardy");
	        Book b4 = new Book("1004", "Journey to the Stars", "Neil Armstrong");
	        Book b5 = new Book("1005", "Secrets of the Ocean", "Megan Turner");
	        Book b6 = new Book("1006", "The Warrior's Path", "George Lucas");
	        Book b7 = new Book("1007", "Mysteries of the Dark", "John Wick");
	        Book b8 = new Book("1008", "The Great Escape", "Helen Hunt");
	        Book b9 = new Book("1009", "Winds of Change", "Oscar Wilde");
	        Book b10 = new Book("1010", "The Last Hope", "J.K. Rowling");
		
		
		LibraryManagement lm = new LibraryManagement();
//		lm.LoginOrRegister();
		LibraryDatabase ld = new LibraryDatabase();
		int val = 0;
		while(val<=5) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\u001B[0mEnter the choice\n1. Login/Register\n2. Available Books \n3. Read Books Directly\n6. Exit the Menu");
			 val = sc.nextInt();
			
			switch(val) {
				
			case 1: 
				int resCode = lm.LoginOrRegister();
				if(resCode==1) {
					
					
					
					// user has been successfully loggedin
					lm.loggedInStudent();
					
				}else if(resCode==11) {
					
					lm.loggedInAdmin();
				}
				
				else if(resCode ==2 ) {
					
					// user has successfully registered
					
				}else {
					System.out.println("Please try again");
				}
					
				
				break;
				
			case 2:
				
			List<Book> book = 	lm.getAllAvailableBooks();
			
			
			for(int i= 0;i<book.size();i++) {
				
				
				Book b = book.get(i);
				
				if(b.getIsBorrowed().equals(false)) {
					System.out.println("\u001B[36mName : "+b.getTitle()+" ID: "+b.getBookID());
					
				}
			}
				
				break;
			case 3:
				ld.readBook("/Users/pradeepsahu/Downloads/2nd.pdf");
				default : 
					
					
					
					break;
					
					
				
			}
				
				
		}
		
		
		System.out.println("\u001B[41mMenu is closed!!! ");
		System.out.println("\u001B[0m");
			
//			ld.PrintAll();
			
//			lm.LoginOrRegister();
//			lm.LoginOrRegister();
//			
//			ld.readBook("");
////			
		
		
		
//		lm.loggedInStudent(); //-- complete this funciton.
	

	}
	
	
	

}
