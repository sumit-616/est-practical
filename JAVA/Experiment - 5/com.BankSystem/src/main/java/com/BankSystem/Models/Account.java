package com.BankSystem.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account extends User{
	
	// Schema of the table
	
	@Id
	private int accountNumber;
	private static String IFSC;
	private static String BranchName;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private User user;
	

	private Double Balance;
	
	static {
		IFSC = "SBIN0001276";
		BranchName = "Central Market Lajpat Nagar Delhi";
	}
	
	
	public Account() {
		super();
	}
	public Account(int accountNumber, String accountHolderName, String address,User user) {
		this.accountNumber = accountNumber;
		this.user = user;
	}
	public User getUser() {
//		return user;
		return null;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public static void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public static void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public static String getIFSC() {
		return IFSC;
	}
	
	public static String getBranchName() {
		return BranchName;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", user=" + user + ", Balance=" + Balance + "]";
	}
	
	
	

	
	
	

}
