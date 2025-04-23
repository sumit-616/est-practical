package utils;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.java.Model.Book;
import com.java.Model.Student;
import com.java.Database.LibraryDatabase;
import com.java.Model.Admin;


import Service.PDFReading;

public class LibraryManagement {
	
	
	private LibraryDatabase ld;
	
	public LibraryManagement(){
		
		Book b1 = new Book("1001","Prince of Hooland","James");
        Book b2 = new Book("1002", "The Lost Treasure", "Sarah Connor");
        Book b3 = new Book("1003", "Kingdom of Fire", "Tom Hardy");
		ld = new LibraryDatabase(b1,b2,b3);
		
	}
	
	
	public int roleBasedRegister() {
		
		System.out.println("Enter the role\n1.Student \n2. Admin");
		
		Scanner ss = new Scanner(System.in);
		
		int roleChoice = ss.nextInt();
		
		switch(roleChoice) {
		case 1:
			
			
			System.out.println("Enter your Name");
			Scanner sns = new Scanner(System.in);
			String names = sns.nextLine();
			Random rs = new Random();
			System.out.println("Enter the password");
			String password =  sns.nextLine();
			String userIDs = "22"+ ((rs.nextInt()*10000)+1);
			
			Admin ads = new Admin(userIDs,names,password);
			
			
			
			if(ld.addUser(ads)==1) {
				System.out.println("\u001B[33mStudent has been successfully added");
				return 2;
				
			}else {
				System.out.println("Something went wrong");
				return -1;
			}
			
			
			
			
		case 2:
			
			System.out.println("Enter your Name");
			Scanner sn = new Scanner(System.in);
			String name = sn.nextLine();
			Random r = new Random();
			System.out.println("Enter the password");
			String pass =  sn.nextLine();
			String userID = "22"+ ((r.nextInt()*10000)+1);
			
			Admin ad = new Admin(userID,name,pass);
			
			
			if(ld.addUser(ad)==1) {
				System.out.println("Admin has been successfully added");
				return 2;
				
			}else {
				System.out.println("Something went wrong");
				return -1;
			}
			
			
			default:
				System.out.println("Plese enter the valid input");
				return -1;
				
		}
		
	}
	
	
	
	
	public int LoginOrRegister() {
		
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the option \n1. Login \n2. Register");
		
		
		
	
		int loginChoice = sc.nextInt();
		
		
		switch(loginChoice){
		case 1:
			
			System.out.println("Enter the role\n1.Student \n2. Admin");
			
			Scanner ssn = new Scanner(System.in);
			
			int roleChoices = ssn.nextInt();
			
			
			
			switch(roleChoices) {
			case 1 : 
				System.out.println("Enter the username");
				Scanner sss = new Scanner(System.in);
				String username  =  sss.nextLine();
				System.out.println("Enter the password");
				String password = sss.nextLine();
				
				if(ld.loginUser(username,password)) {
					System.out.println("\u001B[32mUser has been successfully loggedin ");
					return 1;
				}else {
					System.out.println("Wrong iD or password");
					return 0;
				}
				
				
				
			case 2 : 
				System.out.println("Enter the username");
				Scanner sp = new Scanner(System.in);
				String user =  sp.nextLine();
				System.out.println("Enter the password");
				String pass = sp.nextLine();
				
				if(ld.loginUser(user,pass)) {
					System.out.println("User has been successfully loggedin");
					return 11;
				}else {
					
					System.out.println("Wrong iD or password");
					return 0;
				}
				
				
			}
			
			break;
		case 2:
			
			return this.roleBasedRegister();
			
			
		
		default:
		}
		return -1;
		
	}
	
	
	public List<Book> getAllAvailableBooks(){
		return ld.getBooks();
	}
	
	
	public int loggedInStudent() {
		
		
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		
		while(choice<=3) {
			System.out.println("\u001B[0m1.See Available Books\n2. Issue Book \n3. Read Book \n4. Log Out");
			
			choice = sc.nextInt();
			
	
		
		switch(choice) {
		case 1:
			
			
			List<Book> books = ld.getBooks();
			for(int i= 0;i<books.size();i++) {
				Book b = books.get(i);
				
				if(b.getIsBorrowed().equals(false)) {
					System.out.println("\u001B[32mBook Name : "+b.getTitle()+ " ,ID : " + b.getBookID());
				}
			}
			break;
			
		case 2:
			System.out.println("Please enter the BookID to Issue");
			Scanner ssc = new Scanner(System.in);
			String bookID = ssc.nextLine();
			
			Book book = ld.searchBook(bookID);
			
			if(!book.equals(null)) {
				
				if(ld.issueBook(book) == 1) {
					System.out.println("\u001B[32mBook has been successfully issued");
					
				}else {
					System.out.println("Can't issue the book");
				}
			}
			
			break;
			
		case 3:
			
			String bookFile = "";
			
			
			System.out.println("Which book you want to read? \n1.Prince of Hooland \n2.The Lost Treasure \n3.Kingdom of Fire \n.");
			Scanner ssn = new Scanner(System.in);
			int bookNumber = ssn.nextInt();
			
			if(bookNumber == 1) {
				bookFile = "/Users/pradeepsahu/Desktop/exported-activities.pdf";
			}else if(bookNumber == 2) {
				bookFile = "/Users/pradeepsahu/Desktop/exported-activities.pdf";
				
			}else if(bookNumber == 3) {
				bookFile = "/Users/pradeepsahu/Desktop/exported-activities.pdf";
			}
			
			
			
			
			
			ld.readBook(bookFile);
		}
		
		
		}
		return 0;
	}

	
	
	public int loggedInAdmin() {
		
		System.out.println("what you want to do?\n 1.Add Book in Library \n2. Remove Book \n3. Check Books \n4. Log out");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		
		case 1:
			
			
			
			Random r = new Random();
			String bookID = "10"+ r.nextInt()*100;
			Scanner ssb = new Scanner(System.in);
			
			
			System.out.println("Enter the book Title");
			String bookTitle = ssb.nextLine();
			
			System.out.println("Enter the book Author Name");
			String bookAuthor = ssb.nextLine();
			Book b = new Book(bookID,bookAuthor,bookTitle);
			
			if(ld.addBook(b)==1) {
				
				System.out.println("\u001B[32mBook has been successfully added");
				
			}else {
				System.out.println("\u001B[31m Can't add Book");
			}
			break;
			
			default :
				
				
		}
		return 0;
	}
	
	
	
	

}
