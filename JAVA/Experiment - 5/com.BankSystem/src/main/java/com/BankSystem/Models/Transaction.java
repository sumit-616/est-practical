package com.BankSystem.Models;

import java.security.Timestamp;

public class Transaction {
	
	
	private String tid;
	private String message;
	private Timestamp timestamp;
	private Account sender;
	private Account receiver;
	
	
	public Transaction() {
		super();
	}
	
	public Transaction(String tid, String message, Timestamp timestamp, Account sender, Account receiver) {
		super();
		this.tid = tid;
		this.message = message;
		this.timestamp = timestamp;
		this.sender = sender;
		this.receiver = receiver;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Account getSender() {
		return sender;
	}
	public void setSender(Account sender) {
		this.sender = sender;
	}
	public Account getReceiver() {
		return receiver;
	}
	public void setReceiver(Account receiver) {
		this.receiver = receiver;
	}

}
