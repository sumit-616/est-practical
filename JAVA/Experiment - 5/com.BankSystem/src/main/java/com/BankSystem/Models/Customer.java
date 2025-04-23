package com.BankSystem.Models;

import java.time.LocalDate;

import javax.persistence.Entity;


@Entity
public class Customer extends User {
	
	private Integer customerId;
	private long AccountNumber;
	private Double balance;
	
	

    

}
