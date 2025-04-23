package com.BankSystem.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.BankSystem.Models.Account;
import com.BankSystem.Repository.AccountRepository;

public class AccountService {
	
	// methods are defined here which will be executed on the database table like findAll , etc..
	
	AccountRepository ar;
	
//	Connection con;
//	
//	
//	
//	public void dataBaseConnection() {
//		
//		try {
//			Class.forName("org.postgresql.Driver");
//		 con = DriverManager.getConnection("jdbc:postgresql://localhost/bankmanagementsystem?user=pradeepsahu&password=Pradeep2002");
//		 
//		 
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
	
//	public void getAllAccounts() {
//		
//		try {
//			
//		PreparedStatement st = 	con.prepareStatement("SELECT * FROM account");
//		ResultSet rs = st.executeQuery();
//		
//		while(rs.next()) {
//			
//			Account a = new Account();
//			a.setAccountNumber(rs.getInt(1));
//			a.setFullName(rs.getString(2));
//			Account.setIFSC(rs.getString(3));
//			Account.setBranchName(rs.getString(4));
//			a.setAddress(rs.getString(5));
//			a.setBalance(rs.getDouble(6));
//			
//			
//		
//		
//			
//			
//			System.out.println(a);
//		}
//			
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	
	public List<Account> getAccountByNumber(Integer AccountNumber){
		return ar.findByAccountNumber(AccountNumber);
	}
	
	public List<Account> getAccountByName(String name){
		return ar.findByName(name);
	}
	
	
	public List<Account> getByPhoneNubmer(Integer phoneNumber){
		return ar.findByPhoneNumber(phoneNumber);
	}
	
	
	public List<Account> getByAge(Integer age){
		return ar.findByAge(age);
	}
	
	public List<Account> getByIFSCCode(String ifsccode){
		return ar.findByIFSCCODE(ifsccode);
	}

}
