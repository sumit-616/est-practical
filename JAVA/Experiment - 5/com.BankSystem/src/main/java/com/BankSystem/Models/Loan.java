package com.BankSystem.Models;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;


@Entity
public class Loan {
	
	enum Status{
	Applied,
	Pending,
	Rejected,
	Approved
	};
	
	private String typeOfLoan;
	private Date duration;
	private Integer amount;
	private Employee approvedBy;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private Customer loanRecepient;
	private Status status;
	
	
	public Loan() {
		super();
	}

	public Loan(String typeOfLoan, Date duration, Integer amount, Employee approvedBy, Customer loanRecepient,
			Status status) {
		super();
		this.typeOfLoan = typeOfLoan;
		this.duration = duration;
		this.amount = amount;
		this.approvedBy = approvedBy;
		this.loanRecepient = loanRecepient;
		this.status = status;
	}

	public String getTypeOfLoan() {
		return typeOfLoan;
	}

	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Employee getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Employee approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Customer getLoanRecepient() {
		return loanRecepient;
	}

	public void setLoanRecepient(Customer loanRecepient) {
		this.loanRecepient = loanRecepient;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
