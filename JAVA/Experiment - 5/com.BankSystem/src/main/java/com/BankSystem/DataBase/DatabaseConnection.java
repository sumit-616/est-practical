package com.BankSystem.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	
	public Connection ConnectToDatabase() {
		
		try {
			Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/bankmanagementsystem?user=pradeepsahu&password=Pradeep2002&ssl=true");
		return con;
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return null;
		
	}

}
