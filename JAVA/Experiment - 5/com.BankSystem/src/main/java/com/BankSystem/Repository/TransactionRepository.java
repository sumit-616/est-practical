package com.BankSystem.Repository;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankSystem.Models.Account;
import com.BankSystem.Models.Transaction;
import com.BankSystem.Models.User;


//private String tid;
//private String message;
//private Timestamp timestamp;
//private Account sender;
//private Account receiver;


public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	
	public Transaction findByTid(String tid);
	
	public List<Transaction> findByMessage(String message);
	
	public List<Transaction> findBySender(User sender);
	
	public List<Transaction> findByReceiver(User receiver);

}
